/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task0_Sakila;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stanislav
 */
public class Main {

    public static void main(String[] args) throws SQLException {
     //  insertActor();
        insertActorToAMovie();
    }

    private static void insertActor() throws SQLException {
        String ur1 = "jdbc:mysql://localhost:3306/sakila";
        String userName = "root";
        String password = "chadleclos96";
        
        String query = "INSERT INTO actor(first_name,last_name,last_update)"
                + "VALUES(?,?,?)";

        try(Connection conn = DriverManager.getConnection(ur1,userName,password);
             PreparedStatement statement = conn.prepareStatement(query)){
            statement.setString(1,"Stanislav");
            statement.setString(2,"Trifonov");
            statement.setString(3, "2017-05-31 20:23:00");
            
            statement.execute();
            System.out.println("Insert succeessful");
        }
    }
    
        private static void insertActorToAMovie() throws SQLException{
              String ur1 = "jdbc:mysql://localhost:3306/sakila";
        String userName = "root";
        String password = "chadleclos96";

    /*    try {
            Connection connection = DriverManager.getConnection(ur1, userName, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(
                    "INSERT INTO film_actor(actor_id,film_id,last_update)"
                            + "VALUES(39,90,'2017-05-30 19:00:00')");
           System.out.println("insert successful");     
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        }  */
      String query = "INSERT INTO film_actor(actor_id,film_id,last_update)"
                + "VALUES(?,?,?)";

        try(Connection conn = DriverManager.getConnection(ur1,userName,password);
             PreparedStatement statement = conn.prepareStatement(query)){
            statement.setInt(1,203);
            statement.setInt(2,45);
            statement.setString(3, "2017-05-31 20:34:00");
            
            statement.execute();
            System.out.println("Insert succeessful");
        }
      
    
    }
}
