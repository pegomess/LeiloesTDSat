




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class conectaDAO {

    public Connection getConnection() {

        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/leiloes?useSSL=false";
            String user = "root";
            String password = ""; 
System.out.println("CHEGUEI AQUI");
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
