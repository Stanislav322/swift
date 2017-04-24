/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5_PersonCharacteristics;

import java.time.LocalDate;

/**
 *
 * @author Stanislav
 */
public class SecondaryEducation {
   private double finalGrade;
   private boolean graduated;
   private LocalDate enrollmentDate;
   private LocalDate graduationDate;
   private String institutionName;
   
    SecondaryEducation(double finalGrade, LocalDate enrollmentDate, LocalDate graduationDate, String institutionName) {
        this.finalGrade = finalGrade;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.institutionName = institutionName;
        if (graduationDate.compareTo(LocalDate.now()) > 0) {
            graduated = true;
        } else if (graduationDate.compareTo(LocalDate.now()) < 0) {
            graduated = false;
        }
   
   
}

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
    
    
    
}
