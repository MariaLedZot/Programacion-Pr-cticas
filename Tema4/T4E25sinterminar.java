// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E25sinterminar {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar el sabor y guardarlo en una variable
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        String sabor = sc.nextLine();

            // Hacer una variable para los precios y tipo de tarta
            String precioTarta = "0";
            String tipoTarta = ""; // Inicializar tipoTarta vacío

            // Si es chocolate preguntar cual quiere, luego guardar la decisión en variables
            if (sabor.equals("chocolate")) {
                System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                String tipoChocolate = sc.nextLine();

                // Si es negro o blanco y asignar el precio
                if (tipoChocolate.equals("negro")) {
                    precioTarta = "14";
                    tipoTarta = "chocolate negro";
                } else if (tipoChocolate.equals("blanco")) {
                    precioTarta = "15";
                    tipoTarta = "chocolate blanco";
                }
            } else if (sabor.equals("fresa")) {
                precioTarta = "16";
                tipoTarta = "fresa";
            } else if (sabor.equals("manzana")) {
                precioTarta = "18";
                tipoTarta = "manzana";
            } else {
                System.out.println("Sabor no válido");
                sc.close();
                return;
            }

        // Preguntar por la nata y guardar la respuesta en una variable
        System.out.print("¿Quiere nata? (sí o no): ");
        String nata = sc.nextLine();

            // Precio nata
            String precioNata = "";
            if (nata.equals("si")) {
                precioNata = "2.50";
            } else if (nata.equals("no")) {
                precioNata = "0";
            }

        // Preguntar por el nombre y guardar la respuesta en una variable
        System.out.print("¿Quiere ponerle un nombre? (sí o no): ");
        String nombre = sc.nextLine();

            // Precio nombre
            String precioNombre = "";
            if (nombre.equals("si")) {
                precioNombre = "2.75";
            } else if (nombre.equals("no")) {
                precioNombre = "0";
            }

        // Imprimir el ticket
        System.out.printf("Tarta de %s:             %.2f%n", tipoTarta, precioTarta);
        if (nata.equals("si")) {
            System.out.printf("Con nata:          2,50%n");
        }

        // Cerrar el Scanner
        sc.close();
    }
}