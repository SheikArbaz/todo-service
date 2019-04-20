package com.example.todo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ToDoServiceTest {

    @MockBean
    private ToDoRepository toDoRepository;

    @Test
    void getAllToDos(){
        List<ToDo> toDoList = new ArrayList<ToDo>();
        toDoList.add(new ToDo(1L,"Todo Sample 1",true));
        toDoList.add(new ToDo(2L,"Todo Sample 2",true));
        toDoList.add(new ToDo(3L,"Todo Sample 3",false));
        when(toDoRepository.findAll()).thenReturn(toDoList);
        ToDoService toDoService = new ToDoService(toDoRepository);

        List<ToDo> result = toDoService.findAll();

        assertEquals(3, result.size());
    }
}