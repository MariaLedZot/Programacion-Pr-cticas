// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E3 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar las horas y guardar la variable HORAS
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        int HORAS =  sc.nextInt();

        // Variable para el salario
        int SALARIO;

        // If para las horas menos de 40
        if (HORAS  <= 40) {
            SALARIO = HORAS * 12;
        // Else para las horas más de 40
        }  else {
            SALARIO = (HORAS - 40) * 16 + 480; // 480 es 40 horas x 12
        }

        // Escribe el resultado
        System.out.print("El sueldo semanal que le corresponde es de " + SALARIO + " euros.");

        // Cerrar el Scanner
        sc.close();
    }
}