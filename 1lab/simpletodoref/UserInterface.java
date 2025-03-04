import java.util.Scanner;

public class UserInterface {
    private ITaskManager taskManager;
    private Scanner scanner;

    public UserInterface(ITaskManager taskManager) {
        this.taskManager = taskManager;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = getUserChoice();
            running = processChoice(choice);
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\nМеню:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Удалить задачу");
        System.out.println("3. Отметить задачу выполненной");
        System.out.println("4. Показать все задачи");
        System.out.println("5. Выход");
        System.out.print("Выберите пункт меню: ");
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Некорректный ввод. Пожалуйста, введите число.");
            scanner.next(); // пропустить некорректный ввод
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // потребление символа новой строки
        return choice;
    }

    private boolean processChoice(int choice) {
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                removeTask();
                break;
            case 3:
                markTaskCompleted();
                break;
            case 4:
                taskManager.listTasks();
                break;
            case 5:
                System.out.println("Выход из программы...");
                return false;
            default:
                System.out.println("Некорректный выбор. Попробуйте ещё раз.");
        }
        return true;
    }

    private void addTask() {
        System.out.print("Введите описание задачи: ");
        String description = scanner.nextLine();
        taskManager.addTask(description);
    }

    private void removeTask() {
        System.out.print("Введите id задачи для удаления: ");
        int id = getUserChoice();
        taskManager.removeTask(id);
    }

    private void markTaskCompleted() {
        System.out.print("Введите id задачи для отметки как выполненной: ");
        int id = getUserChoice();
        taskManager.markTaskCompleted(id);
    }
}

