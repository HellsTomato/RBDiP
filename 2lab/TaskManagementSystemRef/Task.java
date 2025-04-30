package org.example.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    private static final AtomicInteger counter = new AtomicInteger(1); // Используем AtomicInteger для счетчика
    private final int id;
    private final String description;
    private final TaskCategory category;
    private final Priority priority;
    private final LocalDate dueDate;
    private boolean completed; // Статус выполнения задачи

    // Конструктор с параметрами
    public Task(String description, TaskCategory category, Priority priority, LocalDate dueDate) {
        this.id = counter.getAndIncrement(); // Инкрементируем AtomicInteger
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.dueDate = dueDate;
        this.completed = false;
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
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return String.format("Task{id=%d, description='%s', category=%s, priority=%s, dueDate=%s, completed=%s}",
                id, description, category, priority, dueDate, completed);
    }
}


