package org.example.model;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Task> tasks;

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

    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Нет задач.");
        } else {
            tasks.forEach(System.out::println);
        }
    }
}

