package tms;

public class TaskManager {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(3, "Test System", "Pending"));

        // Traversing tasks
        System.out.println("\nAll Tasks:");
        taskList.traverseTasks();
        
        // Searching for a task
        System.out.println("\nSearching for Task ID 2:");
        Task found = taskList.searchTask(2);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Task not found.");
        }
        // Deleting a task
        System.out.println("\nDeleting Task ID 1:");
        boolean deleted = taskList.deleteTask(1);
        System.out.println(deleted ? "Task deleted." : "Task not found.");

        System.out.println("\nTasks after deletion:");
        taskList.traverseTasks();
    }
}

