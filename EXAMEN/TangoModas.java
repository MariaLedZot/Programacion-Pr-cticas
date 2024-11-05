package EXAMEN;

// Importamos el Scanner
import java.util.Scanner;

// Creamos la clase "TangoModas"
public class TangoModas {
    public static void main(String[] args) {
        
    // Abrimos el Scanner
    Scanner sc = new Scanner(System.in);

    // Escribimos el título en negrita y la línea separatoria
    System.out.println("\033[1mTANGO MODAS\033[0m");
    System.out.println("==================");

    // Preguntamos y guardamos el código de artículo
    System.out.print("Introduce código de artículo: ");
    int codigoArticulo = sc.nextInt();

    // Preguntamos y guardamos el precio
    System.out.print("Introduce precio: ");
    double precioArticulo = sc.nextDouble();

    // Preguntamos y guardamos las unidades vendidas
    System.out.print("Introduce unidades vendidas: ");
    int unidadesVendidas = sc.nextInt();

    // Preguntamos y guardamos el descuento
    System.out.print("Introduce descuento (%): ");
    double descuento = sc.nextDouble();


    // Hacemos los cálculos
    double precioUnidades = precioArticulo * unidadesVendidas;
    double descuentoAplicado = precioUnidades * (descuento / 100);
    double precioConDescuento = precioUnidades - descuentoAplicado;
    double iva = precioConDescuento * 0.16;
    double precioTotal = precioConDescuento + iva;
    

    // Mostramos el resultado
    System.out.println("\n");
    System.out.println("Su ticket:");
    System.out.println("\n");
    System.out.println("\033[1mTANGO MODAS\033[0m");
    System.out.println("==================================");


    // Escribimos codigoArticulo y precioArticulo
    System.out.println(codigoArticulo + "         " + precioArticulo + "$");
    // Escribimos unidadesVendidas + unidades y el precio calculado (precioUnidades)
    System.out.println(unidadesVendidas + " unidades" + "     " + precioUnidades + "$");
    // Escribimos - descuento % y - precio que se resta (dineroDescuento)
    System.out.println("-" + descuento + "%" + "         " + "-" + descuentoAplicado + "$");
    // Escribimos el IVA y lo que se añade por IVA (iva)
    System.out.println("16% IVA" + "        " + "+" + iva + "$");
    // Escribimos el total (precioTotal)
    System.out.println("\033[48;5;251m\033[1mTOTAL" + "          " + precioTotal + "$\033[0m");


    // Cerrar el scanner
    sc.close();
    }
}
