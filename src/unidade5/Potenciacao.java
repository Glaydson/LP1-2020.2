package unidade5;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com a base da potência: ");
		int base = entrada.nextInt();
		System.out.print("Entre com o expoente da potência: ");
		int expoente = entrada.nextInt();
		System.out.printf("%d elevado a %d é igual a %d", base, expoente, calculaPotencia(base, expoente));
		entrada.close();
	}
	
	private static int calculaPotencia(int base, int expoente) {
		int resultado = 1;
		for (int i = 1; i <= expoente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
}
