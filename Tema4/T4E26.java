// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la jugada del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugada1 = sc.nextLine();

        // Pedir la jugada del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugada2 = sc.nextLine();

        // Ver si ambas jugadas son válidas y crear variables para ello
        // Boolean sirve para saber si es TRUE or FALSE
        boolean jugada1Valida = (jugada1.equals("piedra") || jugada1.equals("papel") || jugada1.equals("tijera"));
        boolean jugada2Valida = (jugada2.equals("piedra") || jugada2.equals("papel") || jugada2.equals("tijera"));

        if (jugada1Valida && jugada2Valida) {
            // Determinar el resultado del juego
            if (jugada1.equals(jugada2)) {
                System.out.println("Empate");
            } else if ((jugada1.equals("piedra") && jugada2.equals("tijera")) ||
                       (jugada1.equals("papel") && jugada2.equals("piedra")) ||
                       (jugada1.equals("tijera") && jugada2.equals("papel"))) {
                System.out.println("\u001B[4mGana el jugador 1\u001B[0m");
            } else {
                System.out.println("\u001B[4mGana el jugador 2\u001B[0m");
            }
        } else {
            System.out.println("Error: una de las opciones es incorrecta.");
        }

        // Cerrar el Scanner
        sc.close();
    }
}