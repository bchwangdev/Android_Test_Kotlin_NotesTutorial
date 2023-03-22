package com.bchwangdev.notestutorial.Database

import androidx.lifecycle.LiveData
import com.bchwangdev.notestutorial.Models.Note

class NoteRepository (private val noteDto : NoteDao) {
    val allNotes : LiveData<List<Note>> = noteDto.getAllNotes()

    suspend fun insert(note:Note){
        noteDto.insert(note)
    }

    suspend fun delete(note:Note){
        noteDto.delete(note)
    }

    suspend fun update(note:Note){
        noteDto.update(note.id, note.title, note.note)
    }
}