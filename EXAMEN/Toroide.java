package EXAMEN;

// Importamos el Scanner
import java.util.Scanner;

// Creamos la clase "Toroide"
public class Toroide {
    public static void main(String[] args) {
        
    // Abrimos el Scanner
    Scanner sc = new Scanner(System.in);

        // Escribimos el título en negrita y ponemos la línea separatoria
        System.out.println("\033[1mVOLUMEN DE UN TOROIDE\033[0m");
        System.out.println("=====================");

        // Pedimos el radio mayor y lo guardamos en una variable
        System.out.print("Introduzca el radio mayor (cms): ");
        double radioMayor = sc.nextDouble();

        // Pedimos el radio menor y lo guardamos en una variable
        System.out.print("Introduzca el radio menor (cms): ");
        double radioMenor = sc.nextDouble();

        // Hacemos una variable con el cálculo del volumen
        double volumen = 2 * Math.PI * Math.PI * radioMayor * Math.pow(radioMenor, 2);

        // Escribimos el resultado
        System.out.printf("El volumen del toroide es de\u001B[31m %.4f\u001B[0m cm\u00B3.\n", volumen);
        
        // Cerrar el scanner
        sc.close();
    }
}
