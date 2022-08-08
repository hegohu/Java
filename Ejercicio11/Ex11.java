package Ejercicio11;

public class Ex11 {
	public static void main(String[] args) {
		// Define una variable global de tipo entero llamada numero inicializada con un
		// valor de 0
		int numero = 0;
		System.out.println(numero);
		System.out.println("Llamada de funcion para incrementar");
		// Haz una función que cada vez que llamemos a la función incrementar,
		// incremente en un valor de la variable numero en 1 número en la misma
		// instrucción
		numero = incrementar(numero);
		System.out.println(numero);
		numero = incrementar(numero);
		System.out.println(numero);
		// Haz otra función llamada decrementar que reduzca el valor de un variable en 2
		// números en la siguiente instrucción
		System.out.println("Llamada para decrementar");
		System.out.println(decrementar(numero));
	}

	public static int incrementar(int num) {
		num++;
		return num;

	}

	public static int decrementar(int num) {
		num=num-2;
		return num;
	}
}
