import java.util.Scanner;

/**
 * Clase SistemaGestionEmpleados que contiene el método principal para gestionar empleados.
 */

public class SistemaGestionEmpleados {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Crea una instancia de la clase Empleados, añade datos de empleados de prueba,
     * muestra los empleados, aumenta su salario, añade un nuevo empleado y muestra los empleados de nuevo.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crea una nueva instancia de la clase Empleados.
        Empleados empleados = new Empleados();
        
        // Añade datos de empleados de prueba a la lista de empleados.
        Empleados.datosEmpleados();
        
        // Muestra la lista de empleados.
        empleados.mostrarEmpleados();
        
        // Aumenta el salario de todos los empleados.
        empleados.aumentarSalario();
        
        // Da de alta a un nuevo empleado llamado "Pepe" con el cargo de programador y un salario de 100000.
        empleados.altaEmpleado(new Empleado("Pepe", Textos.CARGO_PROGRAMADOR, 100000));
        
        // Muestra la lista de empleados de nuevo, que ahora incluye a "Pepe".
        empleados.mostrarEmpleados();
    }
}
