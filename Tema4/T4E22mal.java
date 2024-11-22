// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E22mal {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Mostrar los cargos, pregutar y guardar en variable
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1-3): ");
        String cargo = sc.nextLine();
        System.out.println(" ");

        // Preguntar por los días de viaje y guardarlos en una variable
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        int viaje = sc.nextInt();

        // Hacer una variable y calcular el sueldo base
        int base = sc.nextInt();
        if (cargo.equals("1")) {
            base = 950;
        } else if (cargo.equals("2")){
            base = 1200;
        } else if (cargo.equals("3")) {
            base = 1600;
        }

        // Variable para el dinero por las dietas
        float dietas = viaje * 30;

        // Variable para el sueldo bruto
        float bruto = base + dietas;

        // Preguntar y guardar si está soltero o casado
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        String matrimonio = sc.nextLine();

        // 20 o 25 %
        int porcentaje = sc.nextInt();
        if (matrimonio.equals("1")) {
            porcentaje = 20;
        } else if (matrimonio.equals("2")){
            porcentaje = 25;
        }

        // Calcular el IRPF
        double IRPF = sc.nextInt();
        if (matrimonio.equals("1")) {
            IRPF = bruto * 0.20;
        } else if (matrimonio.equals("2")){
            IRPF = bruto * 0.25;
        }

        // Variable para el TOTAL
        double neto = bruto + IRPF;

        // Escribir el ticket
        System.out.printf("Sueldo base                           %.2f%n", base);
        System.out.printf("Dietas (" + viaje + " viajes)                       %.2f%n", dietas);
        System.out.printf("Sueldo bruto                          %.2f%n", bruto);
        System.out.printf("Retención IRPF (" + porcentaje + "%)                  %.2f%n", IRPF);
        System.out.printf("Sueldo NETO                           %.2f%n", neto);

        // Cerrar el Scanner
        sc.close();
    }
}