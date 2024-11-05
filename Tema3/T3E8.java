import java.util.Scanner;

public class T3E8 {
    public static void main(String[] args) {

        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);

        // Preguntar y leer las horas
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        double horas = sc.nextDouble();

        // Hacer una variable de "salario" que calcule el salario según las horas trabajadas
        double salario = horas * 12;

        // Escribir el salario
        System.out.print("Su salario semanal es de: " + salario + " euros.");
        
        // Cerrar el Scanner
        sc.close();
    }
}
