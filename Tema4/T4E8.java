// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E8 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Explicar de que trata el programa y escribir la fórmula
        System.out.println("Este programa resuelve ecuaciones de segundo grado.");
        System.out.println("ax² + bx + c = 0");

        // Preguntar los valores y guardarlos en variables
        System.out.println("Introduce los valores: ");
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        // Verificar que sea una ecuación de segundo grado. A tiene que ser distinta de 0
        if (a == 0) {
            System.out.print("No es una ecuación de segundo grado.");
        } else {
            // Creo la variable DISCRIMINANTE
            double DISCRIMINANTE = b * b - 4 * a * c;
            // El discriminante en las raices de segundo grado es lo que hay dentro de la raíz y significa lo siguiente:
            // Discriminante - (menor que 0) = sin soluciones
            // Discriminante 0 = 1 solución
            // Discriminante + (mayor que 0) = dos soluciones
        
            if (DISCRIMINANTE < 0) {
                // Discriminante - (menor que 0) = sin soluciones
                System.out.print("La ecuación no tiene solución.");
            } else if (DISCRIMINANTE == 0) {
                // Discriminante 0 = 1 solución
                double x = -b / (2 * a);
                System.out.printf("La ecuación tiene una solución: x = %.2f%n", x);
            } else {
                // Discriminante + (mayor que 0) = dos soluciones
                double x1 = (-b + Math.sqrt(DISCRIMINANTE)) / (2 * a);
                double x2 = (-b - Math.sqrt(DISCRIMINANTE)) / (2 * a);
                System.out.printf("La ecuación tiene dos soluciones: x1 = %.2f y x2 = %.2f%n", x1, x2);
            }
        } 

        // Cerrar el Scanner
        sc.close();
    }
}

// A tiene que ser distinta de 0 para que sea una ecuación de segundo grado
// Para que se pueda hacer la operación la parte de dentro de la raíz tiene que ser positiva
// Si lo de dentro de la raíz es 0, la operación tnedrá 1 solución
// Si lo de dentro de la raíz es distinto de 0, la operación tendrá 2 soluciones