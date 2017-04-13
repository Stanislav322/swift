/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stanislav
 */
public class Person {

    int age;
    String name;

    public Person() {
        name = "No name";
        age = -1;
    }

    public Person(String name) {
        this.name = name;
        this.age = -1;
    }

    public Person(int age, String name) {
        setAge(age);
        this.name = name;
    }

    void setAge(int age) {
        if (this.age > 0 && this.age <= 150) {
            this.age = age;
        } else {
            System.out.println("ERROR");
        }
    }

    String getName() {
        return this.name;
    }

    String introduce() {
        
        if (name.equals("No name")) {
            return "I am John Doe";
        }

        if (age == -1) {
            return "I am " + this.name;
        }

        return "Hello,I am" + this.name + ".I am" + this.age + "years old";

    }

}
