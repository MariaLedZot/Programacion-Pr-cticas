// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E6 {
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
        System.out.printf("La media es de %.2f", MEDIA);

        // Cerrar el Scanner
        sc.close();
    }
}