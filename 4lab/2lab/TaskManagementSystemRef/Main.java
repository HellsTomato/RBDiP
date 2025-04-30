package org.example;

import org.example.service.TaskManager;
import org.example.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        UserInterface userInterface = new UserInterface(taskManager);
        userInterface.start();
    }
}