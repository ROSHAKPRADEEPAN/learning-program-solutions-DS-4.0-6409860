package emp;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        EmployeeManager manager = new EmployeeManager(5);

        Employee emp1 = new Employee(1, "Alice", "Developer", 60000);
        Employee emp2 = new Employee(2, "Bob", "Manager", 80000);
        Employee emp3 = new Employee(3, "Charlie", "Analyst", 50000);
      
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);
        
        System.out.println("Employees after adding:");
        manager.traverseEmployees();
        
        Employee searchedEmployee = manager.searchEmployee(2);
        System.out.println("Searched Employee with ID 2: " + searchedEmployee);

        boolean isDeleted = manager.deleteEmployee(1);
        System.out.println("Employee with ID 1 deleted: " + isDeleted);
        
        System.out.println("Employees after deletion:");
        manager.traverseEmployees();
        
        Employee emp4 = new Employee(4, "Diana", "Designer", 55000);
        manager.addEmployee(emp4);
        
        System.out.println("Employees after adding a new employee:");
        manager.traverseEmployees();
    }
}

