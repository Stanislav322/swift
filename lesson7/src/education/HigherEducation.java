/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package education;

import java.time.LocalDate;

public class HigherEducation extends GradedEducation {

 //   protected String degree;

    public HigherEducation( String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, float finalGrade) {
        super(institutionName, enrollmentDate, graduationDate, finalGrade);
        

    }

    @Override
    public String getDegree() {
        return this.degree;
    }

  /*  @Override
    public boolean gotGraduated() {
        return true;
    } */

}
