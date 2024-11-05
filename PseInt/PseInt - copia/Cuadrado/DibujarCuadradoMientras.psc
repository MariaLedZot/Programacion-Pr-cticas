Algoritmo DibujarCuadrado
	// Pedimos el lado por teclado.
	Escribir "Dame el valor del lado del cuadrado:";
	// Leemos de teclado.
	Leer lado; 
	
	// Bucle para dibujar la altura (filas)
	altura <- 1;
	Mientras altura <= lado Hacer
		base <- 1;
		// Bucle para dibujar la base (columnas)
		Mientras base <= lado Hacer
			Escribir "* " SinSaltar;
			base <- base + 1;
		FinMientras
		Escribir "";
		altura <- altura + 1;
	Fin Mientras
	
FinAlgoritmo
