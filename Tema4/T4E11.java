// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E11 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
        
        // Crear una variable para el contador
        int contador =  0;

        // Título cuestionario en negrita
        System.out.println("\033[1mCUESTIONARIO DE 1º DAW\033[0m");

        // PREGUNTA 1
        System.out.println("1. ¿Qué significa HTML?");
        System.out.println("    a. HyperText Multiple Language");
        System.out.println("    b. HyperText Markup Language");
        System.out.println("    c. HyperText Machine Language");
        System.out.print("=> ");
            String respuesta1 = sc.nextLine();
            if (respuesta1.equals ("b")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 2
        System.out.println("2. ¿Qué etiqueta se usa para insertar una imagen en HTML?");
        System.out.println("    a. <image>");
        System.out.println("    b. <pic>");
        System.out.println("    c. <img>");
        System.out.print("=> ");
            String respuesta2 = sc.nextLine();
            if (respuesta2.equals ("c")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 3
        System.out.println("3. ¿Qué etiqueta se usa para crear un enlace en HTML?");
        System.out.println("    a. <link>");
        System.out.println("    b. <a>");
        System.out.println("    c. <href>");
        System.out.print("=> ");
            String respuesta3 = sc.nextLine();
            if (respuesta3.equals ("b")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 4
        System.out.println("4. ¿Cuál es la etiqueta para hacer el texto en negrita?");
        System.out.println("    a. <strong>");
        System.out.println("    b. <b>");
        System.out.println("    c. <bold>");
        System.out.print("=> ");
            String respuesta4 = sc.nextLine();
            if (respuesta4.equals ("b")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 5
        System.out.println("5. ¿Qué etiqueta se usa para crear un encabezado principal?");
        System.out.println("    a. <h1>");
        System.out.println("    b. <header>");
        System.out.println("    c. <head>");
        System.out.print("=> ");
            String respuesta5 = sc.nextLine();
            if (respuesta5.equals ("a")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 6
        System.out.println("6. ¿Cuál es la extensión de un archivo de estilos CSS?");
        System.out.println("    a. .css");
        System.out.println("    b. .style");
        System.out.println("    c. .scss");
        System.out.print("=> ");
            String respuesta6 = sc.nextLine();
            if (respuesta6.equals ("a")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 7
        System.out.println("7. ¿Cuál propiedad se usa para cambiar el color de fondo en CSS?");
        System.out.println("    a. background-color");
        System.out.println("    b. bg-color");
        System.out.println("    c. color-background");
        System.out.print("=> ");
            String respuesta7 = sc.nextLine();
            if (respuesta7.equals ("a")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 8
        System.out.println("8. ¿Cómo se comenta una línea de código en CSS?");
        System.out.println("    a. // Comentario");
        System.out.println("    b. /* Comentario */");
        System.out.println("    c. # Comentario");
        System.out.print("=> ");
            String respuesta8 = sc.nextLine();
            if (respuesta8.equals ("b")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 9
        System.out.println("9. ¿Qué tipo de dato se usa para almacenar un número decimal en Java?");
        System.out.println("    a. int");
        System.out.println("    b. double");
        System.out.println("    c. char");
        System.out.print("=> ");
            String respuesta9 = sc.nextLine();
            if (respuesta9.equals ("b")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // PREGUNTA 10
        System.out.println("10. ¿Cuál es la forma correcta de imprimir texto en la consola en Java?");
        System.out.println("    a. System.out.print()");
        System.out.println("    b. Console.print()");
        System.out.println("    c. print()");
        System.out.print("=> ");
            String respuesta10 = sc.nextLine();
            if (respuesta10.equals ("a")) {
                System.out.println("Correcto");
                contador ++;
            } else {
                System.out.println("Incorrecto");
            }
        System.out.println(" ");

        // Mostrar el resutado
        System.out.println("Has obtenido " + contador + " puntos.");

        // Cerrar el Scanner
        sc.close();
    }
}