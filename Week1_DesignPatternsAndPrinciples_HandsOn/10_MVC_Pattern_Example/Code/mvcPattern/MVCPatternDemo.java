package mvcPattern;


public class MVCPatternDemo {
    public static void main(String[] args) {

        System.out.println();

        Student model = new Student("John Doe", 1, "A");
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        controller.updateView();
      
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");
        
        controller.updateView();
    }
}

