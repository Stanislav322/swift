/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package education;

import java.time.LocalDate;

/**
 *
 * @author Stanislav
 */
public class GradedEducation extends Education {

    protected float finalGrade;

    public GradedEducation(String institutionName,LocalDate enrollmentDate, LocalDate graduationDate,float finalGrade) {
        super(institutionName, enrollmentDate, graduationDate);
        this.finalGrade = finalGrade;

    }
    public double getFinalGrade(){
        if(this.isGraduated()){
            return finalGrade;
        }
        return - 1;
    }
    
     @Override
    public void gotGraduated(float finalGrade) {
        this.finalGrade = finalGrade;
        
    }

    @Override
    public String getDegree() {
        return this.degree;
    }
    
    

}
