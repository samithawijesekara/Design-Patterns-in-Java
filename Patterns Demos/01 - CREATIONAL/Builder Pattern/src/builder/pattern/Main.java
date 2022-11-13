package builder.pattern;


public class Main {

    public static void main(String[] args) {
        Employee newEmployee = new EmployeeBuilder().setName("Samitha").setAge(25).setPosition("Software Engineering").getEmployee();
        System.out.println(newEmployee);
    }
    
}
