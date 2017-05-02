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
public class Student extends Person {

    private String facultyNumber;
    private int lectureCount;
    private int exerciseCount;

    public Student(String firstName, String lastName, String facultyNumber, int lectureCount, int exerciseCount) {
        super(firstName, lastName);
      setFacultyNumber(facultyNumber);
      setLectureCount(lectureCount);
      setExerciseCount(exerciseCount);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        if (5 > facultyNumber.length() && facultyNumber.length() > 10) {
            System.out.println("Expected length for faculty number is between 5 and 10 symbols.");
            return;
        }
        this.facultyNumber = facultyNumber;

    }

    public int getLectureCount() {
        return lectureCount;
    }

    public void setLectureCount(int lectureCount) {
       if(lectureCount<0){
         System.out.println("Expected positive number for\n" + lectureCount);
         return;
       }
       this.lectureCount = lectureCount;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public void setExerciseCount(int exerciseCount) {
        if(exerciseCount<0){
           System.out.println("\"Expected positive number for\n" + exerciseCount);
        }
        this.exerciseCount = exerciseCount;
    }
    
    @Override
    public String printInfo(){
        String result = super.printInfo()
            + "Occupation: Student\n"
            + "FacultyNumber: "   + facultyNumber + "\n"
            + "Hours Per Day: " + ((lectureCount*2 + exerciseCount*1.5)/5);  
        return result;
    }
     

}
