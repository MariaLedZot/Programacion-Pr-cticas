import java.util.Scanner;

public class T4E27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variables para los precios
        double precioComida = 0;
        double precioBebida = 0;
        String tipoComida = "";
        
        // Preguntar qué ha tomado de comer
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        String comida = sc.nextLine().toLowerCase();
        
        // Asignar precio según el tipo de comida
        if (comida.equals("palmera")) {
            precioComida = 1.40;
            tipoComida = "Palmera";
            
        } else if (comida.equals("donut")) {
            precioComida = 1.00;
            tipoComida = "Donut";
            
        } else if (comida.equals("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            String tipoPitufo = sc.nextLine().toLowerCase();
            
            if (tipoPitufo.equals("aceite")) {
                precioComida = 1.20;
                tipoComida = "Pitufo con aceite";
            } else if (tipoPitufo.equals("tortilla")) {
                precioComida = 1.60;
                tipoComida = "Pitufo con tortilla";
            } else {
                System.out.println("Error: tipo de pitufo no válido.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: tipo de comida no válido.");
            sc.close();
            return;
        }
        
        // Preguntar qué ha tomado de beber
        System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
        String bebida = sc.nextLine().toLowerCase();
        
        if (bebida.equals("zumo")) {
            precioBebida = 1.50;
        } else if (bebida.equals("café")) {
            precioBebida = 1.20;
        } else {
            System.out.println("Error: tipo de bebida no válido.");
            sc.close();
            return;
        }
        
        // Calcular el total
        double totalDesayuno = precioComida + precioBebida;
        
        // Mostrar el detalle de la factura
        System.out.printf("%s: %.2f €\n", tipoComida, precioComida);
        System.out.printf("%s: %.2f €\n", bebida.substring(0, 1).toUpperCase() + bebida.substring(1), precioBebida);
        System.out.printf("Total desayuno: %.2f €\n", totalDesayuno);
        
        // Cerrar el Scanner
        sc.close();
    }
}
