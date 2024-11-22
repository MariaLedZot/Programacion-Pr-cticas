import java.util.Scanner;

public class T4E25 {
    public static void main(String[] args) {
        
        // Abrimos el Scanner
        Scanner sc = new Scanner(System.in);
        
        // Variables para los precios base
        double precioTarta = 0;
        double precioNata = 2.50;
        double precioNombre = 2.75;
        String tipoTarta = "";
        
        // Pedir el sabor de la tarta
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        String sabor = sc.nextLine();
        
        // Asignar precio según el sabor
        // Chocolate
        if (sabor.equals("chocolate")) {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            String tipoChocolate = sc.nextLine().toLowerCase();
            // Chocolate negro
            if (tipoChocolate.equals("negro")) {
                precioTarta = 14.00;
                tipoTarta = "chocolate negro";
            // Chocolate blanco
            } else if (tipoChocolate.equals("blanco")) {
                precioTarta = 15.00;
                tipoTarta = "chocolate blanco";
            // Imprimir mensaje de error
            } else {
                System.out.println("Error: tipo de chocolate no válido.");
                sc.close();
                return;
            }
        // Fresa
        } else if (sabor.equals("fresa")) {
            precioTarta = 16.00;
            tipoTarta = "fresa";
        // Manzana
        } else if (sabor.equals("manzana")) {
            precioTarta = 18.00;
            tipoTarta = "manzana";
        // Sabor no válido
        } else {
            System.out.println("Error: sabor no válido.");
            sc.close();
            return;
        }
        
        // Preguntar si quiere nata
        System.out.print("¿Quiere nata? (si o no): ");
        String quiereNata = sc.nextLine();
        boolean conNata = quiereNata.equals("si");
        
        // Preguntar si quiere nombre
        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        String quiereNombre = sc.nextLine();
        boolean conNombre = quiereNombre.equals("si");
        
        // Calcular el total
        double total = precioTarta;
        // Añadir la nata si se ha seleccionado
        if (conNata) {
            total += precioNata;
        }
        // Añadir el nombre si se ha seleccionado
        if (conNombre) {
            total += precioNombre;
        }
        
        // Mostrar el detalle de la factura
        System.out.printf("Tarta de %s: %.2f €\n", tipoTarta, precioTarta);
        // Si se ha añadido nata mostrarlo
        if (conNata) {
            System.out.printf("Con nata: %.2f €\n", precioNata);
        }
        // Si se ha añadido chocolate mostrarlo
        if (conNombre) {
            System.out.printf("Con nombre: %.2f €\n", precioNombre);
        }
        // Mostrar el total
        System.out.printf("Total: %.2f €\n", total);
        
        // Cerrar el Scanner
        sc.close();
    }
}
