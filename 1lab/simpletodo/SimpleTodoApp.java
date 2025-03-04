import java.util.Scanner;

public class SimpleTodoApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Отметить задачу выполненной");
            System.out.println("4. Показать все задачи");
            System.out.println("5. Выход");
            System.out.print("Выберите пункт меню: ");

            // Считываем выбор пользователя
            int choice = scanner.nextInt();
            scanner.nextLine(); // потребляем символ новой строки

            switch (choice) {
                case 1:
                    System.out.print("Введите описание задачи: ");
                    String description = scanner.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    System.out.print("Введите id задачи для удаления: ");
                    int removeId = scanner.nextInt();
                    manager.removeTask(removeId);
                    break;
                case 3:
                    System.out.print("Введите id задачи для отметки как выполненной: ");
                    int completeId = scanner.nextInt();
                    manager.markTaskCompleted(completeId);
                    break;
                case 4:
                    manager.listTasks();
                    break;
                case 5:
                    System.out.println("Выход из программы...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте ещё раз.");
            }
        }
    }
}

