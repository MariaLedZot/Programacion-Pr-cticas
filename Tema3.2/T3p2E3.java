import java.util.Scanner;

public class T3p2E3 {
    public static void main(String[] args) {

        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);

        // Escribir el título
        System.out.println("\u001B[1mCALCULADORA DE MEDIDAS IMPERIALES \u001B[0m");
        System.out.println("==================================");

        // Preguntar y leer la longitud en metros
        System.out.print("Introduzca una longitud en metros: ");
        double metros = sc.nextDouble();

        // Hacer las conversiones
        double pulgadas = metros * 39.3701;
        double pies = metros * 3.28084;
        double yardas = metros * 1.09361;

        // Escribir el resultado con el valor en metros en negrita
        System.out.printf("\u001B[1m %.0f \u001B[0m metros son:\n", metros);
        System.out.printf("\u001B[33;4m %.3f pulgadas \u001B[0m\n", pulgadas);
        System.out.printf("\u001B[32;4m %.3f pies \u001B[0m\n", pies);
        System.out.printf("\u001B[34;4m %.4f yardas \u001B[0m\n", yardas);

        // Cerrar el Scanner
        sc.close();
    }
}