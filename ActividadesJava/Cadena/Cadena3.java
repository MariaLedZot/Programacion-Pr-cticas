package Cadena;

public class Cadena3 {
    public static void main (String args[]) {
        String nombre = "María";
        int edad = 17;
        int meses = 10;

        //Ejemplo usando println y concatenación de caracteres.
        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y " + meses + " meses.");

        //Ejemplo usando printf y sin concatenación.
        System.out.printf("Me llamo %s, tengo %d años y %d meses.", nombre, edad, meses);
        System.currentTimeMillis(); //Para obtener la hora actual.
    }
}
    

   