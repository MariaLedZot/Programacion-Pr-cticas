import java.util.Scanner;

public class T4E15 {
    public static void main(String[] args) {
        
        // Crear el objeto Scanner
        Scanner sc = new Scanner(System.in);
    
        // Pedir un número al usuario y guardarlo en la variable
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Asegurarnos de trabajar con el valor positivo (si es negativo)
        numero = Math.abs(numero);

        // Usar if y else para determinar el último dígito
        int ultimoDigito;
        if (numero < 10) {
            ultimoDigito = numero;
        } else if (numero < 100) {
            ultimoDigito = numero - (numero / 10) * 10;
        } else if (numero < 1000) {
            ultimoDigito = numero - (numero / 100) * 100;
        } else if (numero < 10000) {
            ultimoDigito = numero - (numero / 1000) * 1000;
        } else {
            ultimoDigito = numero - (numero / 10000) * 10000;
        }

        // Imprimir el último dígito
        System.out.println("El último dígito del número introducido es el " + ultimoDigito);

        // Cerrar el Scanner
        sc.close();
    }
}

/* AQUI LO HICE UTILIZANDO WHILE
// Abrir el Scanner
import java.util.Scanner;

// Abrir la clase con el nombre del ejercicio
public class T4E15 {
    public static void main(String[] args) {
        
        // Abrir el Scanner
        Scanner sc = new Scanner(System.in);
    
        // Pedir un número y guardarlo en una variable
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Calcular el último duro
        if (numero < 10) {
            // Si el número es menos de 10, su último dígito será el mismo número
            System.out.println("El último dígito del número introducido es el " + numero);
        } else {
            // Si el número es más de 10, lo divido entre 10 hasta que deje de serlo
            while (numero >= 10) {
                numero = numero - (numero / 10) * 10;
            }
            // Cuendo no pueda dividirse más, lo mostramos
            System.out.println("El último dígito del número introducido es el " + numero);
        }

        // Cerrar el Scanner
        sc.close();
    }
}
*/