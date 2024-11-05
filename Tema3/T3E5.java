import java.util.Scanner;

public class T3E5 {
    public static void main(String[] args) {
    // Escribir de lo que trata la calculadora
    System.out.println("Área de un rectángulo.");
    System.out.println("----------------------");

    // Abrir el Scanner
    Scanner sc = new Scanner(System.in);

    // Preguntar y leer la base
    System.out.print("Introduzca la longitud de la base (cm): ");
    double base = sc.nextDouble();

    // Preguntar y leer la altura
    System.out.print("Introduzca la altura (cm): ");
    double altura = sc.nextDouble();

    // Hacer una variable de la operación "base x altura"
    double area = base * altura;

    // Generar la salida por pantalla del resultado de la operación
    System.out.println("El área del rectángulo es: " + area);

    // Cerrar el Scanner
    sc.close();
   
    }
}
