package org.example.tests;

import org.example.model.Priority;
import org.example.model.Task;
import org.example.model.TaskCategory;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    // Тест проверяет создание задачи
    @Test
    public void testTaskCreation() {
        // Создаем новую задачу
        Task task = new Task("Завершить лабораторную работу", TaskCategory.STUDY, Priority.HIGH, LocalDate.now());

        assertNotNull(task);
        assertEquals("Завершить лабораторную работу", task.getDescription());
        assertEquals(TaskCategory.STUDY, task.getCategory());
        assertEquals(Priority.HIGH, task.getPriority());
    }

    // Тест проверяет изменение статуса задачи на выполненный
    @Test
    public void testTaskCompletion() {
        Task task = new Task("Завершить лабораторную работу", TaskCategory.STUDY, Priority.HIGH, LocalDate.now());
        task.markCompleted();

        assertTrue(task.isCompleted());
    }
}

