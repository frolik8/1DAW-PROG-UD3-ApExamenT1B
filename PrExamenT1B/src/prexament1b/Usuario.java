package prexament1b;

/**
 * Encapsula los datos de un usuario
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String email;
    private int edad;
    
    private String msgError;

    public Usuario() {
        nombre = "";
        apellidos = "";
        email = "";
        edad = 0;
        msgError = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }

    public String getMsgError() {
        return msgError;
    }
}
