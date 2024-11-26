// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T5E_Tablero {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Declaraciones
        final String BORDE_H = " ---";
        final String BORDE_V = "|";
        int alto = 0;
        int ancho = 0;

        // Guarda la altura introducida por teclado
        while (alto <= 0) {
            try {
                System.out.print("Introduzca la altura del tablero: ");
                alto = sc.nextInt();
                if (alto <= 0) {
                    System.out.println("ERROR: La altura debe ser un número positivo.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La altura debe ser un número positivo.");
                sc.nextLine();
            }
        }

        // Cerrar el Scanner
        sc.close();
    }
}