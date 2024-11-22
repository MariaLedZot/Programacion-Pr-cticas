// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E13 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Escribir de qué trata el programa
        System.out.println("Este programa pinta una pirámide.");

        // Preguntar por el carácter de la pirámide y almacenarlo en una variable
        System.out.print("Introduzca el carácter de relleno: ");
        char caracter = sc.next().charAt(0);

        // Escribir y preguntar el tipo de pirámide, posteriormente guardar su respuesta en una variable
        System.out.println("Elija un tipo de pirámide:");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        System.out.print("  =>");
        int tipo = sc.nextInt();

        // Escribir la pirámide según el tipo de pirámide elegido
        if (tipo == 1) {
            // Pirámide con el vértice hacia arriba
            System.out.println("  " + caracter);
            System.out.println(" " + caracter + "" + caracter + "" + caracter);
            System.out.println(caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter);
        } else if (tipo == 2) {
            // Pirámide con el vértice hacia abajo
            System.out.println(caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter);
            System.out.println(" " + caracter + "" + caracter + "" + caracter);
            System.out.println("  " + caracter);
        } else if (tipo == 3) {
            // Pirámide con el vértice hacia la izquierda
            System.out.println("  " + caracter);
            System.out.println(" " + caracter + "" + caracter);
            System.out.println(caracter + "" + caracter + "" + caracter);
            System.out.println(" " + caracter + "" + caracter);
            System.out.println("  " + caracter);
        } else if (tipo == 4) {
            // Pirámide con el vértice hacia la derecha
            System.out.println(caracter);
            System.out.println(caracter + "" + caracter);
            System.out.println(caracter + "" + caracter + "" + caracter);
            System.out.println(caracter + "" + caracter);
            System.out.println(caracter);
        } else {
            System.out.println("Tipo de pirámide NO válida. Elige un número del 1 al 4 y prueba de nuevo.");
        }

        // Cerrar el Scanner
        sc.close();
    }
}