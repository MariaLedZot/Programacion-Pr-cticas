Algoritmo calculadora2
	escribir "Calculadora de 2 d�gitos";
	escribir "Introduzca 1 para SUMAR o 2 para RESTAR";
	leer operacion;

	Si operacion = 1 Entonces
		Escribir "Introduzca los 2 d�gitos";
		Leer num1, num2;
		suma <- num1 + num2;
		Escribir "El resultado es:" suma;
	SiNo
		Si operacion = 2 Entonces
			Escribir "Introduzca los 2 d�gitos";
			Leer num1, num2;
			suma <- num1 - num2;
			Escribir "El resultado es:" suma;
		SiNo
			Escribir "ERROR: O peraci�n no permitida";
		Fin Si
	Fin Si
	
FinAlgoritmo
