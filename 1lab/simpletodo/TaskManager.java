import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks = new ArrayList<>();

    // Добавление задачи
    public void addTask(String description) {
        int id = tasks.size() + 1;
        tasks.add(new Task(id, description));
        System.out.println("Задача добавлена: " + description);
    }

    // Удаление задачи по id
    public void removeTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).id == id) {
                System.out.println("Задача удалена: " + tasks.get(i).description);
                tasks.remove(i);
                // Перенумерация id
                for (int j = i; j < tasks.size(); j++) {
                    tasks.get(j).id = j + 1;
                }
                return;
            }
        }
        System.out.println("Задача с id " + id + " не найдена.");
    }

    // Отметка задачи как выполненной
    public void markTaskCompleted(int id) {
        for (Task task : tasks) {
            if (task.id == id) {
                task.isCompleted = true;
                System.out.println("Задача выполнена: " + task.description);
                return;
            }
        }
        System.out.println("Задача с id " + id + " не найдена.");
    }

    // Вывод списка задач
    public void listTasks() {
        System.out.println("Список задач:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}


