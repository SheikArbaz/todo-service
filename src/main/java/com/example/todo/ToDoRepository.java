package com.example.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("toDoRepository")
interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
