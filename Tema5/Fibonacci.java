import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n = scanner.nextInt();
        scanner.close();

        int a = 0;
        int b = 1;
        int i = 0;

        while (i < n) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
            i++;
        }
    }
}