package prexament1b;

public class Validador {
    /**
     * Se valida el objeto usuario, teniendo en cuenta:
     * ningún dato puede ser vacío, el email contiene el carácter '@', y 
     * la edad es superior o igual a 18.
     * @param usuario A Validar
     * @return true si es válido, false en caso contrario
     */
    public boolean validar(Usuario usuario) {
        if (this.noHayDatosVacios(usuario) &&
            this.emailTiene('@',usuario) &&
            this.edadMayorIgual(18,usuario)
            )
            return true;
        else
            return false;
    }

    private boolean noHayDatosVacios(Usuario usuario) {
        boolean noHayDatosVacios = true;
        if (usuario.getNombre().isEmpty()){
            usuario.setMsgError(usuario.getMsgError().concat("El campo nombre está vacío.\n"));
            noHayDatosVacios = false;
        }
        if (usuario.getApellidos().isEmpty()) {
            usuario.setMsgError(usuario.getMsgError().concat("El campo apellidos está vacío.\n"));
            noHayDatosVacios = false;
        }    
        if (usuario.getEmail().isEmpty()) {
            usuario.setMsgError(usuario.getMsgError().concat("El campo email está vacío.\n"));
            noHayDatosVacios = false;
        }
        return noHayDatosVacios;
    }

    private boolean emailTiene(char caracter, Usuario usuario) {
        if (usuario.getEmail().indexOf(caracter)==-1) {
            usuario.setMsgError(usuario.getMsgError()+"El email no contiene "+caracter+".\n");
            return false;
        }
        else
            return true;
                
            
    }

    private boolean edadMayorIgual(int limiteInferior, Usuario usuario) {
        if (usuario.getEdad()<limiteInferior) {
            usuario.setMsgError(usuario.getMsgError()+"La edad es inferior a "+limiteInferior+".\n");
            return false;
        }
        else
            return true;
    }
}
