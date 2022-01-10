/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_19630453;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    private static Connection mysqlconfig;
    public static Connection conn()throws SQLException{
        try {         
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection("jdbc:mysql://localhost:3306/uas_19630453", "root", "");            
        } catch (Exception e) {
            System.err.println("koneksi Gagal "+e.getMessage());
        }
        return mysqlconfig;
    }
}
