package prexament1b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class TomarDatos {
    private BufferedReader flujoEntrada;
    private PrintStream flujoSalida;
    public TomarDatos(BufferedReader flujoEntrada, PrintStream flujoSalida) {
        this.flujoEntrada = flujoEntrada;
        this.flujoSalida = flujoSalida;
    }
    public Usuario dameDatos() throws IOException {
        String respuesta;
        int edad;
        
        Usuario usuario = new Usuario();
        flujoSalida.print("Introduzca el nombre: ");
        respuesta = flujoEntrada.readLine();
        usuario.setNombre(respuesta);
        
        flujoSalida.print("Introduzca los apellidos: ");
        respuesta = flujoEntrada.readLine();
        usuario.setApellidos(respuesta);
        
        flujoSalida.print("Introduzca el email: ");
        respuesta = flujoEntrada.readLine();
        usuario.setEmail(respuesta);
        
        flujoSalida.print("Introduzca la edad: ");
        //Probar si funciona, y si no funciona, ¿porqué?
        //edad = flujoEntrada.read();
        edad = Integer.parseInt(flujoEntrada.readLine());
        usuario.setEdad(edad);
        
        return usuario;
    }
}
