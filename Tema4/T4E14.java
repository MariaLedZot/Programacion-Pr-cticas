// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E14 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Título del test en negrita y explicación del programa
        System.out.println("\033[1mTEST DE FIDELIDAD\033[0m");
        System.out.println("\033[1m=================\033[0m");
        System.out.println(" ");
        System.out.println("Este programa te dirá si hay probabilidad de que tu pareja te esté siendo infiel.");
        System.out.println(" ");
        System.out.println(" ");

        // Iniciamos el contador
        int contador = 0;

        // PREGUNTA 1
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta1 = sc.nextLine();
            if (respuesta1.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 2
        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta2 = sc.nextLine();
            if (respuesta2.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 3
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta3 = sc.nextLine();
            if (respuesta3.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 4
        System.out.println("4. Ahora se afeita y asea con más frecuencia (si es hombre) o ahora se arregla el pelo y asea con más frecuencia (si es mujer).");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta4 = sc.nextLine();
            if (respuesta4.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 5
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta5 = sc.nextLine();
            if (respuesta5.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 6
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante. ");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta6 = sc.nextLine();
            if (respuesta6.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 7
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta7 = sc.nextLine();
            if (respuesta7.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 8
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta8 = sc.nextLine();
            if (respuesta8.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 9
        System.out.println("9. Has notado que últimamente se perfuma más.");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta9 = sc.nextLine();
            if (respuesta9.equals("V")) {
                contador += 3;
            }
        
        // PREGUNTA 10
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        System.out.print("(V)erdadero o (F)also: ");
            String respuesta10 = sc.nextLine();
            if (respuesta10.equals("V")) {
                contador += 3;
            }
        
        // Imprimir la frase correspondiente dependiendo la puntuación del test
        if (contador < 10) {
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (contador < 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (contador <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        } else {
            System.out.println("Algo debe haber ido mal :(");
        }

        // Cerrar el Scanner
        sc.close();
    }
}






/*
a. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. 

b. Ha aumentado sus gastos de vestuario.

c. Ha perdido el interés que mostraba anteriormente por ti.

d. Ahora se afeita y asea con más frecuencia (si es hombre) o ahora se arregla el pelo y asea con más frecuencia (si es mujer).

e. No te deja que mires la agenda de su teléfono móvil.

f. A veces tiene llamadas que dice no querer contestar cuando estás tú delante. 

g. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.

h. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.

i. Has notado que últimamente se perfuma más.

j. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.

A continuación se muestran los mensajes que deberá dar el programa según la puntuación obtenida:

Puntuación entre 0 y 10: ¡Enhorabuena! Tu pareja parece ser totalmente fiel.

Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.

Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.

 */