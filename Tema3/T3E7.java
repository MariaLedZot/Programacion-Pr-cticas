import java.util.Scanner;

public class T3E7 {
    public static void main(String[] args) {

    // Abrir el Scanner
    Scanner sc = new Scanner(System.in);
        
    // Preguntar y leer la base imponible
    System.out.print("Introduzca la base imponible (precio del artículo sin IVA): ");
    double base = sc.nextDouble();

    // Hacer una variable que calcule el IVA
    double IVA = base * 0.21;

    // Escribir la "conversión"
    System.out.println("Base imponible:    " + base + " €");
    System.out.println("IVA (21%):          " + IVA + " €");
       
    // Hacer una variable que calcule el TOTAL
    double TOTAL = base + IVA;    

    // Escribir el "resultado"
    System.out.println("-------------------------");
    System.out.println("Total:             " + TOTAL + " €");

    // Cerrar el Scanner
    sc.close();
    }
}

