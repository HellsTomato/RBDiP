package org.example.service;
import org.example.model.Task;
import org.example.model.User;

import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private Map<String, User> users;

    public TaskManager() {
        this.users = new HashMap<>();
    }

    public User getUser(String name) {
        return users.computeIfAbsent(name, User::new);
    }

    public void addTaskForUser(String username, Task task) {
        User user = getUser(username);
        user.addTask(task);
    }

    public void removeTaskForUser(String username, int taskId) {
        User user = getUser(username);
        user.removeTask(taskId);
    }

    public void listTasksForUser(String username) {
        User user = getUser(username);
        user.listTasks();
    }
}
