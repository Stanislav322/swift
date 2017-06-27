/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2_AddressDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stanislav
 */
public class MySqlAddressData {

    private Connection connection;

    public MySqlAddressData() throws SQLException {

        try {
            String url = "jdbc:mysql://localhost:3306/Adress_db";
            String username = "root";
            String password = "chadleclos96";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void getFullAdress() throws SQLException {

        String query = "SELECT * FROM addresses \n"
                + "JOIN streets ON addresses.street_id = streets.ID \n"
                + "JOIN municipalities ON streets.municipality_ID = municipalities.ID\n"
                + "JOIN populated_areas ON municipalities.populated_area_id = populated_areas.ID\n"
                + "JOIN regions ON populated_areas.region_ID = regions.ID\n"
                + "JOIN countries ON regions.country_ID = countries.ID\n"
                + "WHERE addresses.ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1,1);
            try (ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    String number = rs.getString("addresses.number");
                    String streetName = rs.getString("streets.name");
                    int apartamentNo = rs.getInt("addresses.apartamentNo");
                    String municipality = rs.getString("municipalities.name");
                    String populatedArea = rs.getString("populated_areas.name");
                    String region = rs.getString("regions.name");
                    String country = rs.getString("countries.name");

                    System.out.printf("%s %s %s %s %s %s %s%n", number, streetName, apartamentNo,
                            municipality, populatedArea, region, country);

                }

            }
        }
    }

    public void getAddressByMunicipalityName() throws SQLException {
        String query = "SELECT * FROM municipalities\n"
                + "JOIN streets ON streets.municipality_ID = municipalities.ID\n"
                + "JOIN addresses ON addresses.street_id = streets.ID\n"
                + "WHERE municipalities.name= ? ";

        try (PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, "Ohrid");
            try (ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    String number = rs.getString("addresses.number");
                    String streetName = rs.getString("streets.name");
                    int apartmentNo = rs.getInt("addresses.apartamentNo");
                    String municipality = rs.getString("municipalities.name");
                 
                     System.out.printf("%s %s %d %s%n",number,streetName,apartmentNo,municipality);
                }
            }
        }
    }
  

    
}
