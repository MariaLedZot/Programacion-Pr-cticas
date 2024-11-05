Algoritmo Edad
	
	escribir "Introduzca su edad.";
	
	Leer num1;
	
	Si num1 < 18 Entonces
		Escribir "Eres menor de edad."
	SiNo
		Si num1 >= 18 Y num1 < 67 Entonces
			Escribir "Eres mayor de edad."
		SiNo
			Escribir "Estas jubilad@."
		FinSi
	Fin Si
	
FinAlgoritmo
