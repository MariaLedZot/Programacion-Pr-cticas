Algoritmo calculadora
	Escribir "CALCULADORA DE 2 D�GITOS";
	Escribir "Introduzca 1 para sumar o 2 para restar";
	Leer operacion;
	Si operacion = 1 Entonces
		Escribir "Ha escogido sumar";
	SiNo
		Escribir "Ha escogido restar";
	Fin Si
	
	Escribir "Introduzca los dos d�gitos";
	Leer num1, num2;
	Si operacion = 1 Entonces
		suma<- num1 + num2
		Escribir "El resultado de la suma es:" suma;
	SiNo
		resta<- num1 - num2
		Escribir "El resultado de la resta es:" resta;
	Fin Si
	
FinAlgoritmo
