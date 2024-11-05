package EXAMEN;

// Importamos el Scanner
import java.util.Scanner;

// Creamos la clase "Calculadora"
public class Calculadora {
    public static void main(String[] args) {
        
        // Abrimos el Scanner
        Scanner sc = new Scanner(System.in);

        // Escribir el título
        System.out.println("\u001B[1mCALCULADORA DE TIEMPO\u001B[0m");
        System.out.println("=====================");

        // Preguntar los segundos
        System.out.print("Introduce una cantidad de segundos: ");

        // Guardar los segundos en una variable
        int segundosIntroducidos = sc.nextInt();
        
        // Hacer variables para los cálculos
        int horas = segundosIntroducidos / 3600;
        int minutos = (segundosIntroducidos % 3600) / 60;
        int segundos = segundosIntroducidos % 60;

        // Mostrar el resultado
        System.out.println(segundosIntroducidos + " segundos son " + "\033[48;5;11m" + horas + " horas\033[0m, " + "\033[48;5;1m" + minutos + " minutos\033[0m y " + "\033[48;5;10m" + segundos + " segundos\033[0m.");


        // Cerramos el Scanner
        sc.close();
    }
}