package EXAMEN;

// Creamos la clase "Piramide"
public class Piramide {
    public static void main(String[] args) {
        
    // Escribimos variables para los colores y una para quitar los colores
    String colorRojo = "\033[38;5;1m \033[1m";
    String colorNaranja = "\033[38;5;202m \033[1m";
    String colorAmarillo = "\033[38;5;11m \033[1m";
    String colorVerde = "\033[38;5;10m \033[1m";
    String colorAzul = "\033[38;5;39m \033[1m";
    String colorMorado = "\033[38;5;54m \033[1m";
    String colorVioleta = "\033[38;5;91m \033[1m";
    String colorLila = "\033[38;5;128m \033[1m";
    String colorNada = "\033[0m";

    // Hacer la pirámide
    System.out.println("         " + colorRojo + "*" + colorNada);
    System.out.println("       " + colorRojo + "*" + colorNaranja + "*" + colorAmarillo + "*" + colorNada);
    System.out.println("     " + colorRojo + "*" + colorNaranja + "*" + colorAmarillo + "*" + colorVerde + "*" + colorAzul + "*" + colorNada);
    System.out.println("   " + colorRojo + "*" + colorNaranja + "*" + colorAmarillo + "*" + colorVerde + "*" + colorAzul + "*" + colorMorado+ "*" + colorVioleta + "*" + colorNada);
    System.out.println(" " + colorRojo + "*" + colorNaranja + "*" + colorAmarillo + "*" + colorVerde + "*" + colorAzul + "*" + colorMorado+ "*" + colorVioleta + "*" + colorLila + "*" + colorRojo + "*" + colorNada);

    }  
}
