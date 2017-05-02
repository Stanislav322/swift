/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_PeoplePresentation;

/**
 *
 * @author Stanislav
 */
public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if ('Z' >= firstName.charAt(0) && firstName.charAt(0) <= 'A') {
            System.out.println("Expected upper case letter at first\n");
            return;
        }

        if (firstName.length() > 2 && firstName.length() > 30) {
            System.out.println("Expected length for first name is between 2 and 30 symbols.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if ('Z' >= lastName.charAt(0) && lastName.charAt(0) <= 'A') {
            System.out.println("Expected upper case letter at first\n"
                    );
            return;
        }

        if (firstName.length() > 2 && firstName.length() > 30) {
            System.out.println("Expected length for last name is between 2 and 30 symbols.");
        }
        this.firstName = firstName;
    }

    public String printInfo() {
        String result = "FirstName: " + firstName + "\n"
                + "LastName: " + lastName + "\n";

        return result;
    }

}
