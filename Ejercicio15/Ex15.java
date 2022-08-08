package Ejercicio15;

import java.util.Scanner;

public class Ex15 {
public static void main(String[] args) {
	//Calcula si un número es par o impar mediante al operador condicional. Y, finalmente, imprime “par” o “impar” por terminal en función del número introducido.
	Scanner teclado = new Scanner(System.in);
	int num;
	System.out.println("Introduce un numero.");
	num=teclado.nextInt();
	System.out.println(num%2==0?"Par":"Impar");
	//Realiza un programa que nos imprima blanco o negro en función de un Math.random mediante al operador booleano
	 	double numero = Math.random(); 	
	 	System.out.println(numero < 0.5?"Blanco":"Negro");
	 	
	
}
}
