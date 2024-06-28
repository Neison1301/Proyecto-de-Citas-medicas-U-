package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Conexion {

    private Connection conector;
 
    
    String usuario = "root", contraseña = "12345", cadena = "jdbc:mysql://localhost:3306/POO";

    public Connection getConector() {
        return conector;
    }

    public void setConector(Connection conector) {
        this.conector = conector;
    }

    public Connection establecerConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conector = DriverManager.getConnection(cadena, usuario, contraseña);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.toString());
        }
        return conector;
    }

    public void cerrarConexion(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        if (conector == null || conector.isClosed()) {
            throw new SQLException("Conexión no establecida o cerrada.");
        }
        return conector.prepareStatement(sql);
    }
    
    
}
