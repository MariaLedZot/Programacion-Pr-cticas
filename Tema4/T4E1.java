// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E1 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);

        // Preguntar el día de la semana
        System.out.print("Introduce un día de la semana y te diré qué asignatura toca a primera hora ese día: ");

        // Guardar el día de la semana introducido
        String dia = sc.nextLine();

        // Comprobar que día ha introducido y mostrar la asignatura correspondiente
        if (dia.equals("lunes")) {
            System.out.println("El lunes a primera hora tienes ENTORNOS DE DESARROLLO.");
        } else if (dia.equals("martes")) {
            System.out.println("El martes a primera hora tienes PROGRAMACIÓN.");
        } else if (dia.equals("miercoles")) {
            System.out.println("El miercoles a primera hora tienes BASES DE DATOS.");
        } else if (dia.equals("jueves")) {
            System.out.println("El jueves a primera hora tienes PROGRAMACIÓN.");
        } else if (dia.equals("viernes")) {
            System.out.println("El viernes a primera hora tienes PROGRAMACIÓN.");
        } else {
            System.out.println("El día introducido no es correcto. Los posibles días son los siguientes: lunes, martes, miercoles, jueves o viernes.");
        }


        // Cerrar el Scanner
        sc.close();
    }
}
