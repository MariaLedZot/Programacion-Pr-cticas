package Tema5;

// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T5E09_SerieFibonacci {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Declaraciones
        int numero = 0;
        final int PRIMERO = 0;
        final int SEGUNDO = 1;
        int ultimo = SEGUNDO;
        int penultimo = PRIMERO;
        int aux = 0;

        // ->
        try {
            // Preugntar un número y guardarlo
            System.out.println("\033[1mPRIMEROS NÚMEROS DE LA SERIE DE FIBONACCI\033[0m");
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();

            // Calcula la serie fibonacci
            if (numero == 0) {
                System.out.println(PRIMERO);
            } else if (numero == 1){
                System.out.println(PRIMERO + " " + SEGUNDO);
            } else {
                System.out.print(PRIMERO + " " + SEGUNDO + " ");
                while (numero > 2) {
                    aux = ultimo + penultimo;
                    penultimo = ultimo;
                    ultimo = aux;
                    System.out.print(" " + ultimo);

                    // Número
                    numero--;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Se debe introducir un valor numérico");
        } finally {
            sc.close();
        }
    }
}