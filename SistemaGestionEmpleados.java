import java.util.Scanner;

public class SistemaGestionEmpleados {


    public static void main(String[] args) {
        Empleados empleados = new Empleados();
        
        Empleados.datosEmpleados();
        
        empleados.mostrarEmpleados();
        
        empleados.aumentarSalario();
        
        empleados.altaEmpleado(new Empleado("Pepe", "Programador", 100000));
        empleados.mostrarEmpleados();
    }
}
