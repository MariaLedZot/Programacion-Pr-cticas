Algoritmo calculadora2
	escribir "Calculadora de 2 dígitos";
	escribir "1. Sumar";
	escribir "2. Restar";
	escribir "3. Multiplicar";
	escribir "4. Dividir";
	leer operacion;

	Si operacion = 1 Entonces
		Escribir "Introduzca los 2 dígitos";
		Leer num1, num2;
		suma <- num1 + num2;
		Escribir "El resultado es:" suma;
	SiNo
		Si operacion = 2 Entonces
			Escribir "Introduzca los 2 dígitos";
			Leer num1, num2;
			suma <- num1 - num2;
			Escribir "El resultado es:" suma;
		SiNo
			Si operacion = 3 Entonces
				Escribir "Introduzca los 2 dígitos";
				Leer num1, num2;
				suma <- num1 * num2;
				Escribir "El resultado es:" suma;
			SiNo
				Si operacion = 4 Entonces
					Escribir "Introduzca los 2 dígitos";
					Leer num1, num2;
					suma <- num1 / num2;
					Escribir "El resultado es:" suma;
				SiNo
					Escribir "ERROR: Operación no permitida";
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
