Algoritmo DibujarCuadrado
	// Pedimos el lado por teclado.
	Escribir "Dame el valor del lado del cuadrado:";
	// Leemos de teclado.
	Leer lado; 
	
	// Bucle para dibujar la altura (filas)
	Para altura <- 1 Hasta lado Con Paso 1 Hacer
		// Bucle para dibujar la base (columnas)
		Para base <- 1 Hasta lado Con Paso 1 Hacer
			Escribir "* " Sin Saltar;
		Fin Para
		Escribir "";
	Fin Para
	
FinAlgoritmo
