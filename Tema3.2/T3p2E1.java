import java.util.Scanner;

public class T3p2E1 {
    public static void main(String[] args) {

        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);

        // Escribir el título
        System.out.println("\u001B[1mSEGUNDOS QUE TIENE UN DÍA \u001B[0m");
        System.out.println("=========================");

        // Preguntar y leer los días
        System.out.print("Introduzca un número de días: ");
        double dias = sc.nextDouble();

        // Hacer una variable de días a segundos
        double segundos = dias * 86400;

        // Escribir el resultado
        System.out.printf("%.0f días equivalen a %.0f segundos.", dias, segundos);

        // Cerrar el Scanner
        sc.close();
    }
}

