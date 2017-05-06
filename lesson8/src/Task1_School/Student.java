/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_School;

/**
 *
 * @author Stanislav
 */
public class Student extends Class {
      String studentName;
      String studentID;
      
     
     public Student(String name,String classID,String studentName,String studentID){
         super(name,classID);
         setStudentName(studentName);
         setStudentID(studentID);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
     
     
     
}
   