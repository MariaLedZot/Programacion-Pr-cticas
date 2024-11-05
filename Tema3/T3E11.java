import java.util.Scanner;

public class T3E11 {
    public static void main(String[] args) {
    
    //Abrir Scanner
    Scanner sc = new Scanner (System.in);

    // Constante de cambio (El "final" sirve para hacer que no pueda cambiar)
    final double CAMBIO = 1024;

    // Preguntar y guardar los Kb
    System.out.print("Introduzca el número de Kb: ");
    double Kb = sc.nextDouble();

    // Hacer la operación y mostrar
    double Mb = Kb / CAMBIO;
    System.out.println(Kb + "Kb" + " son " + Mb +"Mb");

    // Cerrar Scanner
    sc.close();
    }
}