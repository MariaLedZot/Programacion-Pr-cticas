// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T5E07_MediaAritmetica {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Declaraciones
        int numero = 0;
        int valor = 0;
        float contador = 0;

        // Menu
        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números:");

        while (numero >= 0) {
            try {
                numero = sc.nextInt();
                if (numero >= 0) {
                    valor += numero;
                    contador++;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Sóllo se permiten valores numéricos. Inténtelo de nuevo.");
                sc.nextLine();
            }
        }

        // Calcular la media
        float media = valor / contador;
        System.out.println("La media de los números introducidos es " + media);

        // Cerrar el Scanner
        sc.close();
    }
}