import java.util.ArrayList;
import java.util.Scanner;

public class Empleados {
    static private ArrayList<Empleado> lista;

    public Empleados() {
        this.lista = new ArrayList<>();
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");

        for (Empleado empleado : lista) {
            System.out.println(empleado.toString());
        }
    }

    public void aumentarSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }

        scanner.close();
    }

    public void altaEmpleado(Empleado empleado) {
        System.out.println("Dando de alta a un empleado...");
        this.lista.add(empleado);
    }

    public static Empleados datosEmpleados() {
        lista.add(new Empleado("Juan", "Desarrollador", 50000));
        lista.add(new Empleado("María", "Diseñadora", 45000));
        lista.add(new Empleado("Pedro", "Gerente", 60000));
        return null;
        
    }
}
