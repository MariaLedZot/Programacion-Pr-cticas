import java.util.Scanner;

public class T4E21 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar la base imponible y guardarla en una variable
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = sc.nextDouble();

        // Preguntar el tipo de IVA y guardarlo en una variable
        System.out.print("Introduzca el tipo de IVA ('general', 'reducido' o 'superreducido'): ");
        String tipoIva = sc.next();

        // Preguntar el código promocional y guardarlo en una variable
        System.out.print("Introduzca el código promocional ('nopro', 'mitad', 'meno5' o '5porc'): ");
        String codigoPromocional = sc.next();

        // Variable para almacenar el porcentaje del IVA y el monto del IVA calculado
        double porcentajeIVA = 0;
        double montoIVA = 0;

        // Aplicar el porcentaje de IVA correspondiente
        if (tipoIva.equals("general")) {
            porcentajeIVA = 0.21;
        } else if (tipoIva.equals("reducido")) {
            porcentajeIVA = 0.10;
        } else if (tipoIva.equals("superreducido")) {
            porcentajeIVA = 0.04;
        } else {
            System.out.println("Error: Tipo de IVA no válido.");
            sc.close();
            return;
        }

        // Calcular el monto de IVA y el precio con IVA
        montoIVA = baseImponible * porcentajeIVA;
        double precioConIVA = baseImponible + montoIVA;

        // Variable para almacenar el descuento de la promoción
        double descuento = 0;

        // Aplicar el código promocional correspondiente
        if (codigoPromocional.equals("nopro")) {
            descuento = 0;
        } else if (codigoPromocional.equals("mitad")) {
            descuento = precioConIVA / 2;
        } else if (codigoPromocional.equals("meno5")) {
            descuento = 5;
        } else if (codigoPromocional.equals("5porc")) {
            descuento = precioConIVA * 0.05;
        } else {
            System.out.println("Error: Código promocional no válido.");
            sc.close();
            return;
        }

        // Calcular el precio final después de aplicar el descuento
        double totalConDescuento = precioConIVA - descuento;

        // Variables para los estilos de texto del ticket
        String negrita = "\033[1m";
        String reset = "\033[0m";
        String fondoGris = "\033[47m";

        // Imprimir los resultados
        System.out.printf("Base imponible                    %.2f%n", baseImponible);
        System.out.printf("IVA (%.0f%%)                         %.2f%n", porcentajeIVA * 100, montoIVA);
        System.out.printf("Precio con IVA                    %.2f%n", precioConIVA);
        System.out.printf("Cod. promo.                      -%.2f%n", descuento);
        System.out.printf(negrita + fondoGris + "TOTAL" + reset + fondoGris + "                             %.2f\033[0m%n", totalConDescuento);

        // Cerrar el Scanner
        sc.close();
    }
}