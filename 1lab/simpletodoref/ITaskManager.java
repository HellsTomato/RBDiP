public interface ITaskManager {
    void addTask(String description);
    void removeTask(int id);
    void markTaskCompleted(int id);
    void listTasks();
}

