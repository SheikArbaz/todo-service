package com.example.todo;

import javax.persistence.Entity;

@Entity
public class ToDo {
    private final long id;
    private final String text;
    private final boolean completed;

    public ToDo(long id, String text, boolean completed) {

        this.id = id;
        this.text = text;
        this.completed = completed;
    }
}
