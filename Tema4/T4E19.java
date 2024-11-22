// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E19 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar las notas y guardarlas en variables
        System.out.print("Nota del primer examen: ");
        float nota1 = sc.nextFloat();
        System.out.print("Nota del segundo examen: ");
        float nota2 = sc.nextFloat();

        // Calcular la media y guardarla en una variable
        float media = (nota1 + nota2) / 2;

        // If y else
        if (media >= 5) {
            System.out.println("Tu nota en programación es " + media);
        } else {
            sc.nextLine(); // IMPORTANTE
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String recuperacion = sc.nextLine();
            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota en programación es 5");
            } else if (recuperacion.equals("no apto")) {
                System.out.println("Tu nota en programación es " + media);
            }
        }

        // Cerrar el Scanner
        sc.close();
    }
}