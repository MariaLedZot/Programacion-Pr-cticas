// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E21mal {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar la base imponible y guardarla en una variable
        System.out.print("Introduzca la base imponible: ");
        double  baseImponible = sc.nextDouble();

        // Preguntar el tipo de IVA y guardarlo en una variable
        System.out.print("Introduzca el tipo de IVA ('general', 'reducido' o 'superreducido'): ");
        String tipoIva = sc.next();

        // Preguntar el código promocional y guardarlo en na variable
        System.out.print("Introduzca el código promocional ('nopro', 'mitad', 'meno5' o '5porc'): ");
        String codigoPromocional = sc.next();

        //Nueva variable para los precios con el IVA ya aplicado
        double conIVA = sc.nextDouble();

        // Aplicar el IVA  pertinente
        if (tipoIva.equals("general")) {
            conIVA = baseImponible * 1.21;
        } else if (tipoIva.equals("reducido")) {
            conIVA = baseImponible * 1.10;
        } else if (tipoIva.equals("superreducido")){
            conIVA = baseImponible * 1.04;
        }

        // Variable para escribir el IVA sin ser aplicado al precio
        double IVA = sc.nextDouble();
        if (tipoIva.equals("general")) {
            IVA = baseImponible * 0.21;
        } else if (tipoIva.equals("reducido")) {
            IVA = baseImponible * 0.10;
        } else if (tipoIva.equals("superreducido")){
            IVA = baseImponible * 0.04;
        }

            // Variable para escribir la PROMOCIÓN sin ser aplicado al precio
        double PROMOCION = sc.nextDouble();
        if (tipoIva.equals("nopro")) {
            PROMOCION = 0.00;
        } else if (tipoIva.equals("mitad")) {
            PROMOCION = conIVA / 2;
        } else if (tipoIva.equals("meno5")){
            PROMOCION = 5.00;
        } else if (tipoIva.equals("5porc")){
            PROMOCION = conIVA * 0.05;
        }

        // Variable con el IVA para ponerlo en el ticket (que aparezcca 21% en vez de general)
        int imprimirIVA = 0;
        if (tipoIva.equals("general")) {
            imprimirIVA = 21;
        } else if (tipoIva.equals("reducido")) {
            imprimirIVA = 10;
        } else if (tipoIva.equals("superreducido")){
            imprimirIVA = 04;
        }

        //Nueva variable para los precios con el código promocional ya alplicado
        double conProm = sc.nextDouble();

        // Aplicar el código promocional correspondiente
        if (codigoPromocional.equals("nopro")) {
            conProm = conIVA;
        } else if (codigoPromocional.equals("mitad")) {
            conProm = conIVA / 2;
        } else if (codigoPromocional.equals("meno5")) {
            conProm = conIVA - 5;
        } else if (codigoPromocional.equals("5porc")) {
            conProm = conIVA * 0.95;
        }

        // Para esto no hace falta una variable que convierta de texto a número porque es igual a lo introducido por teclado

        // Variables para los estilos de texto del ticket
        String negrita = "\033[1m";
        String reset = "\033[0m";
        // Imprimir los resultados
        System.out.printf("Base imponible                     %.2f%n", baseImponible);
        System.out.printf("IVA (" + imprimirIVA + "%)                            %.2f%n", IVA);
        System.out.printf("Precio con IVA                     %.2f%n", conIVA);
        System.out.printf("Cod. promo.                       -%.2f%n", PROMOCION);
        System.out.printf(negrita + "TOTAL" + reset + "                              %.2f%n", conProm);


        // Cerrar el Scanner
        sc.close();
    }
}