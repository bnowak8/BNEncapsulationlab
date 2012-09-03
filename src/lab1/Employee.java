package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;


    public Employee() {

    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0){
            System.out.println("No first name entered!");
        }
            
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() == 0){
            System.out.println("No last name entered!");
        }
        this.lastName = lastName;
    }

    private String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn == null || ssn.length() == 0){
            System.out.println("No ssn entered!");
            System.out.println("hello");
        }
        this.ssn = ssn;
    }




    }

