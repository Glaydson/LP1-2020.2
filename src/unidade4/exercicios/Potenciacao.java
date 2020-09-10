package unidade4.exercicios;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int base, expoente, resultado;

		System.out.println("Entre a base: ");
		base = entrada.nextInt();

		System.out.println("Entre o expoente: ");
		expoente = entrada.nextInt();
		
		resultado = 1;
		
		for (int contador = 1; contador <= expoente; contador++) {
			resultado = resultado * base;
		}
		
		System.out.printf("%d elevado a %d é igual a: %d%n", base, expoente, resultado);
		// Math.pow(base, expoente);

	}

}
