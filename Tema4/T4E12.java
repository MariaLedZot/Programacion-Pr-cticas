// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E12 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar por el número
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Variables para par/impar y divisible entre 5
        String parImpar;
        String divisible;

        // Comprobar si el número es par
        if (numero % 2 == 0) {
            parImpar = "\033[1mpar\033[0m"; // Variable para cuando sea par, y el texto en negrita para cuando lo saquemos por print
        } else {
            parImpar = "\033[1mimpar\033[0m"; // Variable para cuando sea impar, y el texto en negrita para cuando lo saquemos por print
        }

        // Comprobar si el número es divisible entre 5
        if (numero % 5 == 0) {
            divisible = "\033[1mes divisible\033[0m"; // Variable para cuando sea divisible entre 5, y el texto en negrita para cuando lo saquemos por print
        } else {
            divisible = "\033[1mno es divisible\033[0m"; // Variable para cuando no sea divisible entre 5, y el texto en negrita para cuando lo saquemos por print
        }

        // Escrribir el resultado
        System.out.println("El número introducido es " + parImpar + " y " + divisible + " entre 5.");

        // Cerrar el Scanner
        sc.close();
    }
}
