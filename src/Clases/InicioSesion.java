package Clases;

public class InicioSesion extends CitasMedicas{

    private String[][] usuarios = {{"usuario", "123"}};
    private boolean inicio;

    public void setUsuarios(String[][] usuarios) {
        this.usuarios = usuarios;
    }

    public boolean isInicio() {
        return inicio;
    }

    public void setInicio(boolean inicio) {
        this.inicio = inicio;
    }

    public InicioSesion() {
        inicio = false;
    }

    public boolean ingresar(String usuario, String contraseña) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0].equals(usuario) && usuarios[i][1].equals(contraseña)) {
                inicio = true;
                return true;
            }
        }
        inicio = false;
        return false;
    }
}
