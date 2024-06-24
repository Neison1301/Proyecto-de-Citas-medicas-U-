package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import miInterfaces.UsuarioInterface;
import modelo.UsuarioDTO;

public class UsuarioDAO implements UsuarioInterface {

    private Conexion conexion; // Instancia de la clase Conexion para obtener la conexión

    public UsuarioDAO() {
        this.conexion = new Conexion(); // Inicializa la conexión
    }

    @Override
    public UsuarioDTO validar(String usuario, String contraseña) {

        UsuarioDTO usuarioDTO = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = conexion.establecerConexion(); // Aquí obtienes la conexión
            String sql = "SELECT * FROM Login WHERE Usuario = ? AND Contraseña = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();

            if (rs.next()) {
                usuarioDTO = new UsuarioDTO();
                usuarioDTO.setUsuario(rs.getString("Usuario"));
                usuarioDTO.setContraseña(rs.getString("Contraseña"));
                // Puedes añadir más mapeos si es necesario
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, "Error al validar usuario", ex);
        }

        return usuarioDTO;
    }
}
