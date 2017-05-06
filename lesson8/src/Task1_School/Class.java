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
public class Class extends School{
    
   private  String classID;
   private  Teacher[] teach;    
    
    
    public Class(String name,String classID) {  
      super(name);
      setClassID(classID);
      setTeach(teach);
    }
    
   public  void setClassID(String classID) {

        this.classID = classID;
    }

    public String getClassID() {
        return classID;
    }
   
   
   
    public Teacher[] getTeach() {
        return teach;
    }

    public void setTeach(Teacher[] teach) {
        this.teach = teach;
    }
   
   
}
