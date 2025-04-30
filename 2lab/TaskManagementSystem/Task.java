package org.example.model;
import org.example.model.Priority;
import org.example.model.TaskCategory;

import java.time.LocalDate;

public class Task {
    private static int counter = 1;
    private int id;
    private String description;
    private TaskCategory category;
    private Priority priority;
    private LocalDate dueDate;
    private boolean completed; // Добавляем поле для статуса задачи

    public Task(String description, TaskCategory category, Priority priority, LocalDate dueDate) {
        this.id = counter++;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.dueDate = dueDate;
        this.completed = false; // Изначально задача не выполнена
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed; // Возвращаем статус выполнения задачи
    }

    public void markCompleted() {
        this.completed = true; // Отмечаем задачу как выполненную
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", description='" + description + "', category=" + category + ", priority=" + priority + ", dueDate=" + dueDate + ", completed=" + completed + '}';
    }
}

