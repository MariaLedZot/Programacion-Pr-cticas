// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E28 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);

        // Variables inciales
        int unidadesArtículo = 0;
        int porcentajeDescuento = 0;
        double descuento = 0;
    
        // Preguntar por el nombre del artículo y guardarlo en una variable
        System.out.print("Introduzca el nombre del artículo: ");
        String nombreArticulo = sc.nextLine();

        // Preguntar por el precio del artículo y guardarlo en una variable
        System.out.print("Introduzca el nombre del artículo: ");
        String precioArticulo = sc.nextLine();

        // Preguntar por las unidades vendidas y guardarlo en una variable
        System.out.print("Introduzca el número de unidades vendidas: ");
        int unidadesVendidas = sc.nextInt();

        // If para los descuentos según el número de unidades vendidas
        if (unidadesVendidas >= 1 && unidadesVendidas <= 3) {
            porcentajeDescuento = 5;
            descuento = 0.95;
        } else if (unidadesVendidas >= 4 && unidadesVendidas <= 10) {
            porcentajeDescuento = 10;
            descuento = 0.90;
        } else if (unidadesVendidas >= 10) {
            porcentajeDescuento = 15;
            descuento = 0.85;
        } else {
            System.out.println("Número de unidades vendida introducido INCORRECTO. Intentelo de nuevo.");
            sc.close();
            return;
        }

        // Factura
        System.out.println("Factura");
        System.out.println("===================================");


        // Cerrar el Scanner
        sc.close();
    }
}
