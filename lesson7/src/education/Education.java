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
public abstract class Education {

    protected String degree;

    protected String institutionName;
    protected LocalDate enrollmentDate;
    protected LocalDate graduationDate;
    protected boolean graduated;

    public Education(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        this.institutionName = institutionName;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;

    }

    public abstract String getDegree();

    public abstract void gotGraduated(float finalGrade);

    public String getInstitutionName() {
        return institutionName;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public boolean isGraduated() {
        return graduated;
    }

}
