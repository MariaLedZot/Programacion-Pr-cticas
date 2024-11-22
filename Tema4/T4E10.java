// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E10 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Pregunto por la hora y los minutos y lso guardo en sus correspondientes variables
        System.out.print("Introduce la hora (0-24): ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos (0-60): ");
        int minutos = sc.nextInt();

        // Hacer las operaciones
        int horaRestante = (23 - hora) * 3600;
        int minutosRestantes = (59 - minutos) * 60;
        int segundosRestantes = horaRestante + minutosRestantes + 60;

        // Mostrar el resultado
        System.out.println("Desde las " + hora + ":" + minutos + " hasta la medianoche, faltan " + segundosRestantes + " segundos.");

        // Cerrar el Scanner
        sc.close();
    }
}
