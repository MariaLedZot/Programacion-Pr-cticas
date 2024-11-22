// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E9 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Explica de que trata el programa
        System.out.println("Este programa te dirá cuál es tu horóscopo.");

        // Pregunta el mes y el día y los guarda en variables
        System.out.print("Introduce el número del mes en que nació (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Ahora introduce el día: ");
        int dia = sc.nextInt();

        // Creo la variable signo
        String signo = sc.nextLine();

        // Aries: 21 de marzo al 19 de abril
        // Tauro: 20 de abril y al 20 de mayo
        // Géminis: 21 de mayo al 20 de junio
        // Cáncer: 21 de junio al 22 de julio
        // Leo: 23 de julio al 22 de agosto
        // Virgo: 23 de agosto al 22 de septiembre
        // Libra: 23 de septiembre al 22 de octubre
        // Escorpio: 23 de octubre al 21 de noviembre
        // Sagitario: 22 de noviembre al 21 de diciembre
        // Capricornio: 22 de diciembre al 19 de enero
        // Acuario: 20 de enero al 18 de febrero
        // Piscis: 19 de febrero al 20 de marzo 

        // Hacer el if y else
        if ( (mes == 3 && dia >= 21) || (mes == 4 && dia <= 19) ) {
            signo = "Aries";
        } else if ( (mes == 4 && dia >= 20) || (mes == 5 && dia <= 20) ) {
            signo = "Tauro";
        } else if ( (mes == 5 && dia >= 21) || (mes == 6 && dia <= 20) ) {
            signo = "Géminis";
        } else if ( (mes == 6 && dia >= 21) || (mes == 7 && dia <= 22) ) {
            signo = "Cáncer";
        } else if ( (mes == 7 && dia >= 23) || (mes == 8 && dia <= 22) ) {
            signo = "Leo";
        } else if ( (mes == 8 && dia >= 23) || (mes == 9 && dia <= 22) ) {
            signo = "Virgo";
        } else if ( (mes == 9 && dia >= 23) || (mes == 10 && dia <= 22) ) {
            signo = "Libra";
        } else if ( (mes == 10 && dia >= 23) || (mes == 11 && dia <= 21) ) {
            signo = "Escorpio";
        } else if ( (mes == 11 && dia >= 22) || (mes == 12 && dia <= 21) ) {
            signo = "Sagitario";
        } else if ( (mes == 12 && dia >= 22) || (mes == 1 && dia <= 19) ) {
            signo = "Capricornio";
        } else if ( (mes == 1 && dia >= 20) || (mes == 2 && dia <= 18) ) {
            signo = "Acuario";
        } else if ( (mes == 2 && dia >= 19) || (mes == 3 && dia <= 20) ) {
            signo = "Piscis";
        }

        // Escribe el horóscopo
        System.out.println("Su horóscopo es " + signo);

        // Cerrar el Scanner
        sc.close();
    }
}