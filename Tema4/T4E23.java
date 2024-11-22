import java.util.Scanner;

public class T4E23 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Preguntar la altura y la anchura de la bandera y guardarlas en variables
        System.out.print("Introduzca la altura de la bandera en cms: ");
        int altura = sc.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        int anchura = sc.nextInt();

        // Limpiar el buffer para evitar problemas con nextLine
        sc.nextLine(); // Captura el salto de línea residual después de nextInt()
        
        // Calcular los centímetros cuadrados
        double area = altura * anchura; // 1 = 1 centimo

        // Convertir de cm^2 (céntimos) a euros
        double euros = area / 100;

        // Preguntar si quiere escudo y guardar la respuesta
        System.out.print("¿Quiere escudo bordado? (si/no): ");
        String escudo = sc.nextLine();

        // Hacer variable y guardar el resultado
        String conSin = "";
        double precio = 0;
        if (escudo.equals("si")) {
            conSin = "Con escudo";
            precio = 2.50;
        } else if (escudo.equals("no")) {
            conSin = "Sin escudo";
            precio = 0.00;
        }

        // Ponerlo todo bonito
        String negrita = "\033[1m";
        String reset = "\033[0m";
        String fondoGris = "\033[47m";

        // Imprimir el ticket
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %.0f cm²:         %.2f \u20AC%n", area, euros);
        System.out.printf("%s:                 %.2f \u20AC%n", conSin, precio);
        System.out.printf("Gastos de envío:            3,25 \u20AC%n");
        System.out.printf(negrita + fondoGris + "Total:                     %.2f \u20AC" + reset + "%n", euros + precio + 3.25);

        
        // Cerrar el Scanner
        sc.close();
    }
}
