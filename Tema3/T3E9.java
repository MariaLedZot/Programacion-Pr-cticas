import java.util.Scanner;

public class T3E9 {
    public static void main(String[] args) {

    // Escribir de qué trata la calculadora
    System.out.println("Volumen de un cono.");
    System.out.println("-------------------");

    // Abrir el Scanner
    Scanner sc = new Scanner(System.in);

    // Preguntar y guardar la altura
    System.out.print("Introduzca la altura (cm): ");
    double altura = sc.nextDouble();

    // Preguntar y guardar el radio
    System.out.print("Introduzca el radio de la base (cm): ");
    double radio = sc.nextDouble();

    // Calcular el volumen del cono
    double volumen = (1.0 / 3) * Math.PI * Math.pow(radio, 2) * altura;

    // Escribir el resultado
    System.out.printf("El volumen del cono es de %.2f cm³", volumen);

    // Cerrar el Scanner
    sc.close();    
    }
}
