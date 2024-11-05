import java.util.Scanner;

public class T3E12 {
    public static void main(String[] args) {
        
        // Escribir de qué trata la calculadora
        System.out.println("Cálculo de la nota necesaria para alcanzar una media deseada.");
        System.out.println("-------------------------------------------------------------");

        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
        
        // Preguntar y guardar la nota del primer examen
        System.out.print("Introduzca la nota del primer examen: ");
        double examen1 = sc.nextDouble();

        // Preguntar y guardar la media deseada
        System.out.print("Introduzca la media deseada: ");
        double media = sc.nextDouble();

        // Calcular la nota necesaria en el segundo examen

        // Calcular la nota del segundo exámen
        double examen2 = (media - (0.4 * examen1)) / 0.6;

        // Mostrar el resultado
        System.out.println("Para tener un " + media + " en el exámen, necesita sacar un " + examen2 + " en el segundo exámen.");

        // Cerrar el Scanner
        sc.close();
    }
}
