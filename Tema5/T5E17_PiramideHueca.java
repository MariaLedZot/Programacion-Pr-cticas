// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T5E17_PiramideHueca {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Declaraciones
        String relleno = "";
        int altura = 0;

        // Preguntamos la altura y la guardamos
        while (altura <= 0) {
            try {
                System.out.print("Introduce la altura de la piramide: ");
                altura = sc.nextInt();
                if (altura <= 0) {
                    System.out.println("ERROR: La altura debe ser un número entero positivo.");
                }
            } catch (Exception e){
                System.out.println("ERROR: La altura debe ser un número entero positivo.");
            } finally {
                sc.nextLine();
            }
        }

        // Preguntamos el carácter de relleno y lo guardamos
        while (relleno.length() != 1) {
            System.out.print("Introduce el carácter de relleno: ");
            relleno = sc.nextLine();
            if (relleno.length() != 1) {
                System.out.println("ERROR: El carácter de relleno debe ser de longitud 1");
            }
        }

        // Cerrar el Scanner
        sc.close();

        // Pintar la pirámide
        int base = -2 * altura - 1;
        int espaciosBlanco = base / 2;
    }
}