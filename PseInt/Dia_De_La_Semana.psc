Algoritmo nota
	escribir "Dime tu nota.";
	
	Leer notaNumerica;
	Segun notaNumerica Hacer
		0, 1, 2, 3, 4:
			notaTexto = "Insuficiente." ;
		5:
			notaTexto = "Suficiente." ;
		6:
			notaTexto = "Bien." ;
		7, 8:
			notaTexto = "Notable." ;
		9, 10: 
			notaTexto = "Sobresaliente." ;
		De Otro Modo:
			Escribir "ERROR";
	Fin Segun
	
	Escribir notaTexto;
	
FinAlgoritmo
