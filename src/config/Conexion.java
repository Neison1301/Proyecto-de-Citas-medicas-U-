package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conector = null;
    String usuario = "root", contraseña = "12345", cadena = "jdbc:mysql://localhost:3306/POO";

    public Connection establecerConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conector = DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Se conecto a la base de datos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.toString());
        }
        return conector;

    }
}
