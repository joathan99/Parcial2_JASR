import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Empleados que gestiona una lista de empleados.
 */

public class Empleados {

    /**
     * Lista de empleados.
     */

    static private ArrayList<Empleado> lista;


    /**
     * Constructor de la clase Empleados.
     * Inicializa la lista de empleados.
     */

    public Empleados() {
        this.lista = new ArrayList<>();
    }

    /**
     * Método para mostrar la lista de empleados.
     * Imprime la lista de empleados en la consola.
     */

    public void mostrarEmpleados() {
        System.out.println(Textos.LISTA_EMPLEADOS);

        for (Empleado empleado : lista) {
            System.out.println(empleado.toString());
        }
    }

    /**
     * Método para aumentar el salario de todos los empleados.
     * Solicita al usuario que introduzca el porcentaje de aumento de salario,
     * luego aumenta el salario de cada empleado en la lista por ese porcentaje.
     */

    public void aumentarSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }

        scanner.close();
    }

    /**
     * Método para dar de alta a un empleado.
     * Añade el empleado proporcionado a la lista de empleados.
     * @param empleado El empleado a añadir.
     */

    public void altaEmpleado(Empleado empleado) {
        System.out.println(Textos.ALTA_EMPLEADO);
        this.lista.add(empleado);
    }

    /**
     * Método para añadir datos de empleados de prueba a la lista.
     * Añade tres empleados de prueba a la lista.
     */

    public static Empleados datosEmpleados() {
        lista.add(new Empleado("Juan", Textos.CARGO_DESARROLLADOR, 50000));
        lista.add(new Empleado("María", Textos.CARGO_DISEÑADOR, 45000));
        lista.add(new Empleado("Pedro", Textos.CARGO_GERENTE, 60000));
        return null;
        
    }
}
