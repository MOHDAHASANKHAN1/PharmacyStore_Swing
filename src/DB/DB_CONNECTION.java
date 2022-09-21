/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aimta
 */
public class DB_CONNECTION {

    public Connection Con;
    public Statement Stmt;
    public PreparedStatement Pstmt;
    public ResultSet Rst;

    public DB_CONNECTION() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConDb = "jdbc:mysql://localhost:3306/pharmacy";
            String ConUsername = "root";
            String ConPassword = "Khan@786";
            Con = DriverManager.getConnection(ConDb, ConUsername, ConPassword);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
