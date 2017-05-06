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
public class Discipline extends Class {
   private  String disciplineName;
   private  int disciplineAmount;
    
    
    
    public Discipline(String name, String classID,String disciplineName,int disciplineAmount) {
        super(name, classID);
        setDisciplineName(disciplineName);
        setDisciplineAmount(disciplineAmount);
        
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public int getDisciplineAmount() {
        return disciplineAmount;
    }

    public void setDisciplineAmount(int disciplineAmount) {
        this.disciplineAmount = disciplineAmount;
    }
    
    
}
