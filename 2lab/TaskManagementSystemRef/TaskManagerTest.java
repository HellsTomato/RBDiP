package org.example.tests;

import org.example.model.Priority;
import org.example.model.Task;
import org.example.model.TaskCategory;
import org.example.service.TaskManager;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    // Тест проверяет добавление задачи пользователю
    @Test
    public void testAddTaskForUser() {
        TaskManager taskManager = new TaskManager();
        Task task = new Task("Завершить лабораторную работу", TaskCategory.STUDY, Priority.HIGH, LocalDate.now());

        taskManager.addTaskForUser("Алиса", task);
        // Проверяем, что задача была добавлена
        assertEquals(1, taskManager.getUser("Алиса").getTasks().size());
        // Проверяем, что описание задачи совпадает с ожидаемым
        assertEquals("Завершить лабораторную работу", taskManager.getUser("Алиса").getTasks().get(0).getDescription());
    }

    // Тест проверяет удаление задачи у пользователя
    @Test
    public void testRemoveTaskForUser() {
        TaskManager taskManager = new TaskManager();
        Task task = new Task("Завершить лабораторную работу", TaskCategory.STUDY, Priority.HIGH, LocalDate.now());

        taskManager.addTaskForUser("Алиса", task);
        taskManager.removeTaskForUser("Алиса", task.getId());

        // Проверяем, что задачи у пользователя больше нет
        assertTrue(taskManager.getUser("Алиса").getTasks().isEmpty());
    }

    // Тест проверяет отображение всех задач пользователя
    @Test
    public void testListTasksForUser() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task("Завершить лабораторную работу", TaskCategory.STUDY, Priority.HIGH, LocalDate.now());
        Task task2 = new Task("Подготовиться к экзамену", TaskCategory.STUDY, Priority.MEDIUM, LocalDate.now().plusDays(1));

        taskManager.addTaskForUser("Алиса", task1);
        taskManager.addTaskForUser("Алиса", task2);

        // Проверяем, что у пользователя теперь две задачи
        assertEquals(2, taskManager.getUser("Алиса").getTasks().size());
    }
}


