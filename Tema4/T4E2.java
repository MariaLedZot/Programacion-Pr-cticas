// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E2 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar la hora
        System.out.print("Introduce una hora del día (0-23): ");

        // Guardar la hora
        int hora = sc.nextInt();

        // Comprobar la hora y si está dentro del rango escribir el mensaje correspondiente
        // Comprobar si el número introducido está entre el 0 y el 23 y si es así comprobar la hora introducida
        if (hora >= 0 && hora <= 23) {
            // Si la hora está entre las 6 las 12, mostrar el mensaje: "Buenos días."
            if (hora >= 6 && hora <= 12) {
                System.out.println("Buenos días.");
            // Si la hora está entre las 13 las 20, mostrar el mensaje: "Buenas tardes."
            } else if (hora >= 13 && hora <= 20) {
                System.out.println("Buenas tardes.");
            // Si la hora está entre las 21 y las 5, mostrar el mensaje: "Buenas noches."
            } else {
                System.out.println("Buenas noches.");
            }
        // Y si el número introducido no está entre el 0 y el 23, mostrar el mensaje: "La hora introducida no es correcta."
        } else {
            System.out.println("La hora introducida no es correcta.");
        }
    
        // Cerrar el Scanner
        sc.close();
    }
}