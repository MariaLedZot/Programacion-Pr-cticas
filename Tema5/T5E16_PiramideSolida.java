package Tema5;

// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T5E16_PiramideSolida {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Declaraciones
        String relleno = "";
        int altura = 0;

        // Preguntar la altura y guardarla
        while (altura <= 0) {
            try {
                System.out.print("Introduce la altura de la piramide: ");
                altura = sc.nextInt();
                if (altura <= 0) {
                    System.out.println("ERROR: La altura debe ser un número entero positivo.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La altura debe ser un número entero positivo.");
            } finally {
                sc.nextLine();
            }
        }

        // Preguntar el carácter de relleno y guardarlo
        while (relleno.length() != 1) {
            System.out.print("Introduce el carácter de relleno: ");
            relleno = sc.nextLine();
            if (relleno.length() != 1) {
                System.out.println("ERROR: El carácter de relleno debe ser de longitud 1");
            }
        }

        // Cerrar el Scanner
        sc.close();

        // Pintar la pirámide
        int base = 2 * altura - 1;
        int espaciosBlanco = base / 2;
        String fila = relleno;
        for (int i = 0; i < altura; i++) {
            for (int blancos = 1; blancos <= espaciosBlanco; blancos++) {
                System.out.print(" ");
            }
        System.out.println(fila);
        espaciosBlanco -= 1;
        fila = fila + relleno + relleno;
        }
    }
}