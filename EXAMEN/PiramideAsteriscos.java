package EXAMEN;

public class PiramideAsteriscos {
    public static void main(String[] args) {
        // Colores ANSI
        String colorRojo = "\u001B[31m";  // Rojo
        String colorVerde = "\u001B[32m"; // Verde
        String colorAmarillo = "\u001B[33m"; // Amarillo
        String colorReset = "\u001B[0m";  // Resetear color

        // Imprimir la pirámide
        System.out.println("      " + colorRojo + "**" + colorReset);
        System.out.println("     " + colorVerde + "***" + colorReset);
        System.out.println("    " + colorAmarillo + "*****" + colorReset);
        System.out.println("   " + colorRojo + "*******" + colorReset);
        System.out.println("  " + colorVerde + "*********" + colorReset);
    }
}

