// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E5 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Explicar el programa y guardar las variables
        System.out.println("Cálculo del tiempo de caída de un objeto.");
        System.out.print("Introduzca la altura (en metros) desde la que cae el objeto: ");
        double h = sc.nextDouble();

        // Calcular el resultado
        double resultado = Math.sqrt( (2*h) / 9.81); // He puesto directamente la gravedad en vez de crear una variable para esta, ya que es constante.

        // If para diferenciar A de 0 o no 0, para que no haya error.
        if (h == 0) {
            System.out.print("No tiene sentido que calcules el tiempo de caída de un objeto que no cae :(.");
        } else {
            System.out.printf("El objeto tardará %.2f segundos.%n", resultado);
        }

        // Cerrar el Scanner
        sc.close();
    }
}