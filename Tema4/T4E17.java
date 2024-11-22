// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E17 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar por el número y guardarlo en una variable
        System.out.print("Introduce un número entero (de 5 cifras como máximo): ");
        int numero = sc.nextInt();

        // Convertir a positivo (en caso de que sea negativo)
        numero = Math.abs(numero);
        
        // Hacer  una variable para los dígitos y contarlos con if y else
        int digitos;
        if (numero <10) {
            digitos = 1;
        } else if (numero <100) {
            digitos = 2;
        } else if (numero <1000) {
            digitos = 3;
        } else if (numero <10000) {
            digitos = 4;
        } else if (numero <100000) {
            digitos = 5;
        } else {
            System.out.println("El número es mayor a 5 dígitos.");
            sc.close();
            return;
        }

        // Imprimir el resultado
        System.out.println("El número introducido tiene " + digitos + " dígitos.");

        // Cerrar el Scanner
        sc.close();
    }
}