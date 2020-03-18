/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gpatel
 */
public class ConnectDatabase {
    Connection con;
    ConnectDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gpatel", "root", "");    
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    void fetch_allData(){
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from testing");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
