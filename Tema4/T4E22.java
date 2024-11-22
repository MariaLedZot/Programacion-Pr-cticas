import java.util.Scanner;

public class T4E22 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Mostrar los cargos, preguntar y guardar en variable
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1-3): ");
        int cargo = sc.nextInt();
        System.out.println(" ");

        // Calcular el sueldo base según el cargo
        int base = 0;
        if (cargo == 1) {
            base = 950;
        } else if (cargo == 2) {
            base = 1200;
        } else if (cargo == 3) {
            base = 1600;
        } else {
            System.out.println("Error: Cargo no válido.");
            sc.close();
            return;
        }

        // Preguntar por los días de viaje y guardarlos en una variable
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        int viaje = sc.nextInt();
        System.out.println(" ");

        // Calcular el dinero por dietas (30 euros por día de viaje)
        float dietas = viaje * 30;

        // Calcular el sueldo bruto
        float bruto = base + dietas;

        // Preguntar y guardar el estado civil
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = sc.nextInt();
        System.out.println(" ");

        // Calcular el porcentaje de IRPF según el estado civil
        double porcentajeIRPF;
        if (estadoCivil == 1) {
            porcentajeIRPF = 0.25;
        } else if (estadoCivil == 2) {
            porcentajeIRPF = 0.20;
        } else {
            System.out.println("Error: Estado civil no válido.");
            sc.close();
            return;
        }

        // Calcular el IRPF en euros y el sueldo neto
        double IRPF = bruto * porcentajeIRPF;
        double neto = bruto - IRPF;

        // Escribir el ticket
        System.out.println("--------------------------------------------");
        System.out.printf("|Sueldo base                        %.2f|%n", (float) base);
        System.out.printf("|Dietas (%d días)                     %.2f|%n", viaje, dietas);
        System.out.println("--------------------------------------------");
        System.out.printf("|Sueldo bruto                       %.2f|%n", bruto);
        System.out.printf("|Retención IRPF (%.0f%%)                %.2f|%n", porcentajeIRPF * 100, IRPF);
        System.out.println("--------------------------------------------");
        System.out.printf("|Sueldo neto                        %.2f|%n", neto);
        System.out.println("--------------------------------------------");

        // Cerrar el Scanner
        sc.close();
    }
}
