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
public class Worker extends Person {

    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary<0){
           System.out.println("Expected positive number for\n" + weekSalary);
           return;
        }
            this.weekSalary = weekSalary;
        
    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        if(workHoursPerDay<0){
            System.out.println("Expected positive number for\n" + workHoursPerDay);
            return;
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public String printInfo(){
        String result = super.printInfo()
         + "Occupation: Worker\n" 
         + "Week salary: " + weekSalary + "\n"
         + "Hours per day: " + workHoursPerDay + "\n"
         + "Salary per hour: " + weekSalary / (5*workHoursPerDay);
        return result;
    }
    
    
}
