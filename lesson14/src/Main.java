
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stanislav
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/school_db";
        String username = "root";
        String password = "chadleclos96";

        Connection conn = DriverManager.getConnection(url, username, password);

        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("Select * from school_db.disciplines; ");

        while (result.next()) {
            int id = result.getInt("id");
            String name = result.getString("name");
            System.out.printf("%s %s%n", id, name);

        }

    }

}
