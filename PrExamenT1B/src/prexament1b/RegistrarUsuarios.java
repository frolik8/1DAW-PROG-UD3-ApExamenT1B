package prexament1b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class RegistrarUsuarios {
    
    private int totalUsuarios;
    
    /**
     * Flujo de Entrada
     */
    private BufferedReader flujoEntrada;
    /**
     * Flujo de salida
     */
    
    private PrintStream flujoSalida;
    
    public RegistrarUsuarios() {
        totalUsuarios = 0;
        flujoEntrada = new BufferedReader(new InputStreamReader(System.in));
        flujoSalida = System.out;
    }
    
    public void registrar() {
        //int totalUsuarios = 0;
        try {
            do {
                //totalUsuarios = this.registraUnUsuario(totalUsuarios);
                this.registraUnUsuario();
            } while (!this.salir());
        } catch (IOException e) {
            flujoSalida.println("Error de entrada/salida, finalizará la aplicación.");
        }
        flujoSalida.println("Total usuarios registrados: "+totalUsuarios);
    }

    private boolean salir() throws IOException {
        String respuesta;
        flujoSalida.print("Pulse s para salir, cualquier otra tecla para continuar:");
        respuesta = flujoEntrada.readLine();
        if (!respuesta.isEmpty() && respuesta.toLowerCase().charAt(0)=='s')
            return true;
        else
            return false;
    }
/*
    private int registraUnUsuario(int totUsuarios) {
        
        // Datos de usuario
        Usuario usuario;
        
        // Creación objetos de proceso
        TomarDatos tomarDatos = new TomarDatos(flujoEntrada, flujoSalida);
        Validador validador = new Validador();
        GrabarDatos grabarDatos = new GrabarDatos();
        
        usuario = tomarDatos.dameDatos();
        
        if (validador.validar(usuario)){
            grabarDatos.grabar(usuario);
            totUsuarios++;
        }
        else
            System.out.println("Error en la validación de datos.");
        return totUsuarios;
    }
 */
    private void registraUnUsuario() {
        
        // Datos de usuario
        Usuario usuario;
        
        // Creación objetos de proceso
        TomarDatos tomarDatos = new TomarDatos(flujoEntrada, flujoSalida);
        Validador validador = new Validador();
        GrabarDatos grabarDatos = new GrabarDatos();
        try {
            usuario = tomarDatos.dameDatos();
            
            if (validador.validar(usuario)){
                grabarDatos.grabar(usuario);
                totalUsuarios++;
            }
            else
                System.out.println("Error en la validación de datos.");
        } catch(IOException ioe) {
            flujoSalida.println("Error de entrada/salida en toma de datos.");
        } catch(NumberFormatException nfe) {
            flujoSalida.println("Error de formato de dato en la edad.");
        }
    }   
}
