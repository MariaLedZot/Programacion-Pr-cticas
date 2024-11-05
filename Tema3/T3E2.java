import java.util.Scanner;

public class T3E2 {
    public static void main(String[] args) {
        // Conversor de Euros a Pesetas
        // Constante que define el tipo de cambio
        final double TIPO = 166.386;

        // Definimos e iniciamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Leer por teclado una cantidad en Euros
        System.out.print("Introduzca una cantidad en Euros: ");
        double euros = sc.nextDouble();

        // Calculamos el valor en Pesetas
        double pesetas = euros * TIPO;

        // Salida por pantalla
        System.out.println(euros + "€ son " + pesetas + " pesetas.");

        // Cerramos el Scanner
        sc.close();
    }
}
