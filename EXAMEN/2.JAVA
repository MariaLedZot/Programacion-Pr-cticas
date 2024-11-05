

        // Calcular horas, minutos y segundos
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        // Mostrar el resultado con formato y colores
        System.out.println(totalSegundos + " segundos son " +
                "\033[1;34m" + horas + "\033[0m horas, " + 
                "\033[1;32m" + minutos + "\033[0m minutos y " +
                "\033[1;31m" + segundos + "\033[0m segundos.");
        
        // Cerrar el escáner
        scanner.close();
    }
}
