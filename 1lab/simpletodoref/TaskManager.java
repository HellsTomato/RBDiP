import java.util.ArrayList;
import java.util.List;

public class TaskManager implements ITaskManager {
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(String description) {
        int id = tasks.size() + 1;
        tasks.add(new Task(id, description));
        System.out.println("Задача добавлена: " + description);
    }

    @Override
    public void removeTask(int id) {
        int index = findTaskIndexById(id);
        if (index != -1) {
            System.out.println("Задача удалена: " + tasks.get(index).getDescription());
            tasks.remove(index);
            updateTaskIds();
        } else {
            System.out.println("Задача с id " + id + " не найдена.");
        }
    }

    @Override
    public void markTaskCompleted(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            task.markCompleted();
            System.out.println("Задача выполнена: " + task.getDescription());
        } else {
            System.out.println("Задача с id " + id + " не найдена.");
        }
    }

    @Override
    public void listTasks() {
        System.out.println("Список задач:");
        if (tasks.isEmpty()) {
            System.out.println("Нет доступных задач.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    // Вспомогательный метод для поиска задачи по id
    private Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    // Вспомогательный метод для поиска индекса задачи по id
    private int findTaskIndexById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    // Перенумерация id после удаления
    private void updateTaskIds() {
        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).setId(i + 1);
        }
    }
}

