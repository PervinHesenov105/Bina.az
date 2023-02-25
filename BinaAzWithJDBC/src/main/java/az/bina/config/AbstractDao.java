/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.bina.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Perfect
 */
public abstract class AbstractDao {

    public static Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/binaaz", "boot1", "1234");
        return conn;
    }
}
