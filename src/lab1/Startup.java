package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Actions action = new Actions();
        employee.setFirstName("Peter");
        employee.setLastName("Piper");
        employee.setSsn("333-1234");


        System.out.println("The employee's status is: " + action.getStatus());
    }
    
    
}
