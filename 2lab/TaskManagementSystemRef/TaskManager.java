package org.example.service;

import org.example.model.Task;
import org.example.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskManager {
    private final Map<String, User> users;

    public TaskManager() {
        this.users = new HashMap<>();
    }

    // Получаем пользователя, если его нет - создаем
    public User getUser(String name) {
        return users.computeIfAbsent(name, User::new);
    }

    // Добавляем задачу для пользователя
    public void addTaskForUser(String username, Task task) {
        User user = getUser(username);
        if (task != null) {
            user.addTask(task);
        } else {
            System.out.println("Задача не может быть добавлена: она пустая.");
        }
    }

    // Удаляем задачу у пользователя
    public void removeTaskForUser(String username, int taskId) {
        User user = getUser(username);
        Optional<Task> task = user.getTaskById(taskId);
        if (task.isPresent()) {
            user.removeTask(taskId);
        } else {
            System.out.println("Задача с ID " + taskId + " не найдена у пользователя " + username);
        }
    }

    // Показываем все задачи пользователя
    public void listTasksForUser(String username) {
        User user = getUser(username);
        user.listTasks();
    }
}

