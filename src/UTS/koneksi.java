/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionpane;
/**
 *
 * @author Qq
 */
public class koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLExceptoion{
        if (mysqlkonek==null){
            try{
                String DB = "jdbc:mysql://localhost:127.0.0.1/dbsiswa";
                String user = "root";
                String pass = "";
                Drivermanager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek=(Connection)DriverManager.getConnection(DB, user, pass);
                
            }catch (Exception e){    
                
               
            }
        }return mysqlkonek; 
    }
    
}
