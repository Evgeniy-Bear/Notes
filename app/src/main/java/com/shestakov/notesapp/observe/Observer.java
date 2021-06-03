package com.shestakov.notesapp.observe;

import com.shestakov.notesapp.data.Note;

public interface Observer {
    void updateNote(Note note);
}

