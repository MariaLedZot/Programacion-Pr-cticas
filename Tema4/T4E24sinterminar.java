// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E24sinterminar {
    public static void main(String[] args) {
        
        // Abrir el Scanner
            Scanner sc = new Scanner(System.in);
    
        // Preguntar los datos y guardarlos en variables
            System.out.println("Venta de entradas CineCampa");

            System.out.print("Número de entradas: ");
            int numEntradas = sc.nextInt();
            sc.nextLine();

            System.out.print("Día de la semana: ");
            String diaSemana = sc.nextLine();

            System.out.print("¿Tienes tarjeta de CineCampa? (si/no): ");
            String tarjDescuento = sc.nextLine();
        
        // Variable para el total (sin descuento)
            double totalSinDescuento = 0;

        // If y else

            if (diaSemana.equals("miércoles")) {
                System.out.printf("Entradas individuales:              %.0f", numEntradas);
                System.out.printf("Precio por entrada individual:      5.00€");
                totalSinDescuento = numEntradas * 5;
                System.out.printf("Total:                              %.2f", totalSinDescuento);
            } else if (diaSemana.equals("jueves")) {
                System.out.printf("Entradas de parejas:              %.0f", numEntradas/2);
                System.out.printf("Precio por entrada individual:     11.00€");
                int parejas = numEntradas / 2;
                int individuales = numEntradas % 2;
                double totalParejas = parejas * 11;
                double totalIndividuales = individuales * 8;
                totalSinDescuento = totalParejas + totalIndividuales;
                System.out.printf("Total:                              %.2f", totalSinDescuento);
            } else if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("viernes") || diaSemana.equals("sábado") || diaSemana.equals("domingo")) {
                System.out.printf("Entradas individuales:              %.0f", numEntradas);
                System.out.printf("Precio por entrada individual:      8.00€");
                totalSinDescuento = numEntradas * 8;
                System.out.printf("Total:                              %.2f", totalSinDescuento);
            }
        
        
        
        
        // Imprimir ticket
            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

        // Cerrar el Scanner
        sc.close();
    }
}