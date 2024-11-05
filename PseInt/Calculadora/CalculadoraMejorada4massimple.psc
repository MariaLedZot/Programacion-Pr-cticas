Algoritmo calculadora2
	escribir "Calculadora de 2 dígitos";
	escribir "1. Sumar";
	escribir "2. Restar";
	escribir "3. Multiplicar";
	escribir "4. Dividir";
	leer operacion;
	Segun operacion Hacer
		1:
			Escribir "Introduzca los 2 dígitos";
			Leer num1, num2;
			resultado <- num1 + num2;
			Escribir "El resultado es:" resultado;
		2:
			Escribir "Introduzca los 2 dígitos";
			Leer num1, num2;
			resultado <- num1 - num2;
			Escribir "El resultado es:" resultado;
		3:
			Escribir "Introduzca los 2 dígitos";
			Leer num1, num2;
			resultado <- num1 * num2;
			Escribir "El resultado es:" resultado;
		4:
			Escribir "Introduzca los 2 dígitos";
			Leer num1, num2;
			resultado <- num1 / num2;
			Escribir "El resultado es:" resultado;
		De Otro Modo:
			Escribir "ERROR: Operación no permitida";
	Fin Segun
	
FinAlgoritmo
