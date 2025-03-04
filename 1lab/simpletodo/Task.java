public class Task {
    int id;               // Поле id задачи
    String description;   // Описание задачи
    boolean isCompleted;  // Флаг, выполнена ли задача

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
    }

    @Override
    public String toString() {
        return id + ". " + description + " [" + (isCompleted ? "X" : " ") + "]";
    }
}

