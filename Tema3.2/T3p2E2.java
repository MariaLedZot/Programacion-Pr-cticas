import java.util.Scanner;

public class T3p2E2 {
    public static void main(String[] args) {

        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);

        // Escribir el título
        System.out.println("\u001B[1mVOLUMEN DE UNA ESFERA \u001B[0m");
        System.out.println("======================");

        // Preguntar y leer el radio
        System.out.print("Introduzca el radio de la esfera (cms): ");
        double radio = sc.nextDouble();

        // Hacer una variable de radio a volumen
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        // Escribir el resultado
        System.out.printf("El volumen del toroide es de \u001B[31m %.5f \u001B[0m cms\u00B3.", volumen);

        // Cerrar el Scanner
        sc.close();
    }
}

