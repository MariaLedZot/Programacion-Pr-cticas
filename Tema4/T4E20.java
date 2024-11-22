// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E20 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar por el día de la semana y guardarlo en una variable
        System.out.print("Introduzca un día de la semana (de lunes a viernes): ");
        String dia = sc.nextLine();

        // Preguntar la hora y minutos y guardarlo en variables
        System.out.println("A continuación introduzca la hora (hora y minutos)");
        
        System.out.print("Hora (0-23): ");
        int hora = sc.nextInt();
            // Validar que la hora esté en el rango correcto
            if (hora < 0 || hora > 23) {
                System.out.println("Error: La hora debe estar entre 0 y 23.");
                sc.close();
                return;
            }
        System.out.print("Minutos (0-60): ");
        int minutos = sc.nextInt();
            // Validar que los minutos estén en el rango correcto
            if (minutos < 0 || minutos > 59) {
                System.out.println("Error: Los minutos deben estar entre 0 y 59.");
                sc.close();
                return;
            }

        // Hacer una variable para el total (en minutos)
        int total = hora * 60 + minutos;

        // Hacer una variable para los minutos que vamos a imprimir
        int minutosTotales;

        // Hacer el if para calcular los minutos
        if (dia.equals("lunes")) {
            minutosTotales = (1440 * 4) + (15 * 60) - total;
        } else if (dia.equals("martes")) {
            minutosTotales = (1440 * 3) + (15 * 60) - total;
        } else if (dia.equals("miércoles")) {
            minutosTotales = (1440 * 2) + (15 * 60) - total;
        } else if (dia.equals("jueves")) {
            minutosTotales = (1440 * 1) + (15 * 60) - total;
        } else if (dia.equals("viernes")) {
            minutosTotales = (15 * 60) - total;
        } else {
            System.out.println("Error: Día no válido. Introduzca un día entre 'lunes' y 'viernes'.");
            sc.close();
            return;
        }

        // Imprimir el resultado
        System.out.println("Faltan " + minutosTotales + " minutos para llegar al fin de semana.");

        // Cerrar el Scanner
        sc.close();
    }
}