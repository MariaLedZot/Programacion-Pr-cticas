// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E7 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar las 3 notas y guardarlas en variables
        System.out.print("Introduzca la primera nota: ");
        double NOTA1 = sc.nextDouble();
        System.out.print("Ahora introduzca la segunda nota: ");
        double NOTA2 = sc.nextDouble();
        System.out.print("Por último introduzca la tercera nota: ");
        double NOTA3 = sc.nextDouble();

        // Calcular la media
        double MEDIA = (NOTA1 + NOTA2 + NOTA3) / 3;

        // Escribir el resultado con 2 decimales
        System.out.printf("La media es de %.2f%n", MEDIA); // He añadido el %n para el salto de línea

        // If para ampliar el programa y diga la nota del boletín
        if (MEDIA < 5) {
            System.out.println("Insuficiente");
        } else if (MEDIA < 6) {
            System.out.println("Suficiente");
        } else if (MEDIA < 7) {
            System.out.println("Bien");
        } else if (MEDIA < 9) {
            System.out.println("Notable");
        } else if (MEDIA <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Los datos introducidos son incorrectos, y la media da un resultado mayor de lo posible."); // He añadido esto por si se meten mal las notas y la media da más de 10, que se notifique.
        }

        // Cerrar el Scanner
        sc.close();
    }
}