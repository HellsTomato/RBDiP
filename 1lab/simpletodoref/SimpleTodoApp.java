public class SimpleTodoApp {
    public static void main(String[] args) {
        ITaskManager manager = new TaskManager();
        UserInterface ui = new UserInterface(manager);
        ui.start();
    }
}

