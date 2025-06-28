package com.almuheetu.android_room_db_sample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private val repo: NoteRepository

    val allNotes: StateFlow<List<Note>>

    init {
        val dao = NoteDatabase.getDatabase(application).noteDao()
        repo = NoteRepository(dao)

        allNotes = repo.allNotes.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            emptyList()
        )
    }

    fun addNote(title: String, desc: String) = viewModelScope.launch {
        val note = Note(title = title, description = desc, priority = 1)
        repo.insert(note)
    }

    fun deleteNote(note: Note) = viewModelScope.launch {
        repo.delete(note)
    }
}
