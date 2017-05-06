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
public class Teacher extends Class{
  private  String teacherName;
  private  Discipline[] discipline;
     
    
    public Teacher(String name,String classID,String teacherName,Discipline[] discipline){
      super(name,classID); 
      this.teacherName = teacherName;
      this.discipline = discipline;
     
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Discipline[] getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline[] discipline) {
        this.discipline = discipline;
    }
    
    
}
