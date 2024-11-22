package Tema5;

// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T5E04_CajaFuerte {
    public static void main(String[] args) {
        // Declaraciones
        final int OPORTUNIDADES = 4;
        int contador = 1;
        String combinacion = "1234";
        boolean acierto = false;

        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Este switch rellena de ceros a la izquierda la combinación si esta es un número menor de 4 dígitos
        switch (combinacion.length()) {
            case 1:
                combinacion = "000" + combinacion;
                break;
            case 2:
            combinacion = "00" + combinacion;
            break;
            case 3:
            combinacion = "0" + combinacion;
            break;
        }

        while (!acierto && contador <= OPORTUNIDADES) {
            System.out.print("Introduce la clave de la caja fuerte: ");
            String clave = sc.nextLine();

            // Comprobar
            if (clave.equals(combinacion)) {
                acierto = true;
                System.out.println("\033[1mSe ha abierto la caja fuerte\033[0m");
                } else {
                    System.out.println("\033[1mClave incorrecta\033[0m");
                }
                // Incrementar contador
                contador++;
        }

        if (!acierto) {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.\r\n" + "Se ha emitido un aviso a la policía.");
        }
        // Cerrar el Scanner
        sc.close();
    }
}