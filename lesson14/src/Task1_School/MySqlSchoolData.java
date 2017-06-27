/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_School;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Stanislav
 */
public class MySqlSchoolData {

    private Connection connection;

    public MySqlSchoolData() {
        try {
            String url = "jdbc:mysql://localhost:3306/school_db";
            String username = "root";
            String password = "chadleclos96";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertTeacher() {

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(
                    "INSERT INTO teachers(id, name, email, salary, address_id)"
                    + "VALUES(5, 'Ivan Petrov', 'ivan@abv.bg', 1500.00, 5)");
            System.out.println("Insert successful");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void getTeacher(int id) {

        try (
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(
                        "SELECT name "
                        + "FROM teachers "
                        + "WHERE id=" + id)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void getTeachers() {

        try (
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(
                        "SELECT name"
                        + "FROM teachers "
                        + "WHERE salary BETWEEN 1000 AND 1900")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " "
                        + resultSet.getDouble("salary"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertStudent() {

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(
                    "INSERT INTO students(id, name, enrollmentDate)"
                    + "VALUES(5, 'Stanislav Trifonov', '20017-02-10')");
            System.out.println("Insert successful");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
     public void getStudent() throws SQLException{
         String query = "Select name from students"
                 + "where id = ?";
         
         try(PreparedStatement statement = connection.prepareStatement(query)){
             statement.setInt(1,2);
           
          try(ResultSet rs = statement.executeQuery()){
              while(rs.next()){
                  String name = rs.getString("students.name");
                  System.out.printf("%s",name);
              }
          }
             
         }
         
     }
      

    public void getStudents() {

        try (
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(
                        "SELECT name "
                        + "FROM students "
                        + "WHERE enrollment_Date >'2006-10-10'")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void getTeachersByDisciplineName() throws SQLException {

        String query = "SELECT teachers.name from teachers"
                + "JOIN disciplines_taught ON teachers.id = disciplines_taught.teacher_id"
                + "JOIN disciplines ON disciplines.id = disciplines_taught.discipline_id "
                + "where disciplines.name = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, "Mathematics");

            try (ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    String teacherName = rs.getString("teachers.name");
                    System.out.printf("%s", teacherName);
                }

            }
        }
    }
    public void getDisciplinesByTeacherId() throws SQLException{
        
        String query = "Select disciplines.name from disciplines"
                + "JOIN disciplines_taught ON disciplines.id = disciplines_taught.discipline_id"
                + "JOIN teachers on teachers.id = disciplines_taught.teacher_id"
                + "where teachers.id = ?";
        
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1,1);
            
           try(ResultSet rs = statement.executeQuery()){
               while(rs.next()){
                   String discipline = rs.getString("disciplines.name");
                   System.out.printf("%s",discipline);
               }
           }
        }
        
    }

}
