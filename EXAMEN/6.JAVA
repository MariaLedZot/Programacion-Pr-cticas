import java.util.Scanner;

public class TicketTango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos
        System.out.println("TANGO MODAS");
        System.out.println("==============================");
        System.out.print("Introduce código de artículo: ");
        String codigoArticulo = scanner.nextLine();
        
        System.out.print("Introduce precio: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Introduce unidades vendidas: ");
        int unidades = scanner.nextInt();
        
        System.out.print("Introduce descuento (%): ");
        double descuento = scanner.nextDouble();

        // Cálculos
        double precioTotal = precio * unidades;
        double descuentoAplicado = precioTotal * (descuento / 100);
        double precioConDescuento = precioTotal - descuentoAplicado;
        double iva = precioConDescuento * 0.16;
        double total = precioConDescuento + iva;

        // Formateo de salida
        System.out.println("\nSu ticket:\n");
        System.out.println("TANGO MODAS");
        System.out.println("==============================");
        System.out.printf("%-12s %10s€%n", codigoArticulo, String.format("%.2f", precio));
        System.out.printf("%-12s %10s€%n", unidades + " unidades", String.format("%.2f", precioTotal));
        System.out.printf("%-12s %10s€%n", "-" + (int)descuento + "%", String.format("-%.2f", descuentoAplicado));
        System.out.printf("%-12s %10s€%n", "16% IVA", String.format("+%.2f", iva));
        System.out.printf("%-12s %10s€%n", "TOTAL", String.format("%.2f", total));

        scanner.close();
    }
}
