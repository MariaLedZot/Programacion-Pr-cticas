// Importamos el Scanner
import java.util.Scanner;

public class T3E4 {
    public static void main(String[] args) {
        // Bienvenida
        System.out.println("Este programa realiza las 4 operaciones básicas de dos números decimales.");

        // Abrimos el Scanner
        Scanner sc = new Scanner(System.in);

        // Pide el primer número
        System.out.print("Por favor, introduzca el primer número: ");
        // Lee el número
        double num1 = sc.nextDouble();

        // Pide el segundo número
        System.out.print("Por favor, introduzca el segundo número: ");
        // Lee el número
        double num2 = sc.nextDouble();

        // Almacenamos cada resultado en una variable
        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double cociente = num1 / num2;

        // Generamos salida por pantalla
        System.out.println("x = " + num1);
        System.out.println("y = " + num2);
        System.out.println("x + y = " + suma);
        System.out.println("x - y = " + resta);
        System.out.println("x * y = " + producto);
        System.out.println("x / y = " + cociente);

        // Cerramos el Scanner
        sc.close();
    }
    
}
