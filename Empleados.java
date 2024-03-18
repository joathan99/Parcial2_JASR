import java.util.ArrayList;
import java.util.Scanner;

public class Empleados {
    static private ArrayList<Empleado> lista;


    public Empleados() {
        this.lista = new ArrayList<>();
    }

    public void mostrarEmpleados() {
        System.out.println(Textos.LISTA_EMPLEADOS);

        for (Empleado empleado : lista) {
            System.out.println(empleado.toString());
        }
    }

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

    public void altaEmpleado(Empleado empleado) {
        System.out.println(Textos.ALTA_EMPLEADO);
        this.lista.add(empleado);
    }

    public static Empleados datosEmpleados() {
        lista.add(new Empleado("Juan", Textos.CARGO_DESARROLLADOR, 50000));
        lista.add(new Empleado("María", Textos.CARGO_DISEÑADOR, 45000));
        lista.add(new Empleado("Pedro", Textos.CARGO_GERENTE, 60000));
        return null;
        
    }
}
