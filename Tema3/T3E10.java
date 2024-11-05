import java.util.Scanner;

public class T3E10 {
    public static void main(String[] args) {
    
    //Abrir Scanner
    Scanner sc = new Scanner (System.in);

    // Constante de cambio (El "final" sirve para hacer que no pueda cambiar)
    final double CAMBIO = 1024;

    // Preguntar y guardar los Mb
    System.out.print("Introduzca el número de Mb: ");
    double Mb = sc.nextDouble();

    // Hacer la operación y mostrar
    double Kb = CAMBIO * Mb;
    System.out.println(Mb + "Mb" + " son " + Kb +"Kb");

    // Cerrar Scanner
    sc.close();
    }
}
