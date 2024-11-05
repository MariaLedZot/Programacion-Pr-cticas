package EXAMEN;

// Importamos el Scanner
import java.util.Scanner;

// Creamos la clase "VueltasTierra"
public class VueltasTierra {
    public static void main(String[] args) {
        
    // Abrimos el Scanner
    Scanner sc = new Scanner(System.in);

    // Escribimos el título en negrita y la línea separatoria
    System.out.println("\033[1m VUELTAS A LA TIERRA \033[0m");
    System.out.println("====================");
    
    // Preguntamos por el número de años
    System.out.print("Introduzca el número de años: ");

    // Guardamos los años en una variable
    int years =  sc.nextInt();

    // Hacemos una variable para las vueltas dadas, multiplicando el número introducido por 365
    int vueltas = years * 365;
    
    // Mostramos el resultado
    System.out.print("La tierra habrá dado un total de "  + vueltas + " vueltas en "  + years + " años.");

    // Cerramos el Scanner
    sc.close();
    }
}
