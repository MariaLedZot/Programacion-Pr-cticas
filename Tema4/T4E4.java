// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E4 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Explicar el programa y guardar las variables
        System.out.println("El programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Introduzca el valor de b: ");
        float b = sc.nextFloat();

        // Calcular el resultado
        float resultado = -b / a;

        // If para diferenciar A de 0 o no 0, para que no haya error.
        if (a == 0) {
            System.out.print("Esta ecuación no tiene solución real.");
        } else {
            System.out.print("x = " + resultado);
        }

        // Cerrar el Scanner
        sc.close();
    }
}