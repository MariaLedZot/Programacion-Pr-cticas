import java.util.Scanner;

public class T3E3 {
    public static void main(String[] args) {
        // Conversor de Pesetas a Euros
        // Constante que define el tipo de cambio
        final double TIPO = 166.386;

        // Definimos e iniciamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Leer por teclado una cantidad en Pesetas
        System.out.print("Introduzca una cantidad en Pesetas: ");
        double pesetas = sc.nextDouble();

        // Calculamos el valor en Euros
        double euros = pesetas / TIPO;

        // Salida por pantalla
        System.out.println(pesetas + " pesetas son " + euros + " €.");

        // Cerramos el Scanner
        sc.close();
    }
}
