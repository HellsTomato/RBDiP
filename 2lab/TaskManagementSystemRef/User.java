package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class User {
    private final String name;
    private final List<Task> tasks;

    public User(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }

    // Получаем задачу по ID
    public Optional<Task> getTaskById(int taskId) {
        return tasks.stream().filter(task -> task.getId() == taskId).findFirst();
    }

    // Выводим все задачи пользователя
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("У пользователя нет задач.");
        } else {
            tasks.forEach(task -> System.out.println(task.toString()));
        }
    }
}


