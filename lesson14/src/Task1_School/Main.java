/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_School;

import java.sql.SQLException;

/**
 *
 * @author Stanislav
 */
public class Main {
    
    public static void main(String[]args) throws SQLException {
    MySqlSchoolData mySqlSchoolData = new MySqlSchoolData();
   // mySqlSchoolData.getTeachersByDisciplineName();
  //  mySqlSchoolData.getDisciplinesByTeacherId();
    mySqlSchoolData.getStudent();
   
    }
}
