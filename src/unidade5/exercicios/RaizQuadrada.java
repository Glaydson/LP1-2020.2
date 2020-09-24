package unidade5.exercicios;

import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número para o qual deseja calcular a raiz: ");
		int numero = entrada.nextInt();
		
		double raiz = calculaRaizQuadrada(numero);
		System.out.printf("A raiz quadrada de %d é %.2f%n", numero, raiz);
		System.out.printf("A raiz quadrada de %d é %.2f%n", numero, calculaRaizQuadrada(numero));

	}

	private static double calculaRaizQuadrada(int numero) {
		return Math.pow(numero, 0.5);
		// Math.sqrt(numero)
	}
	
	public double hipotenusa(double cateto1, double cateto2) {
		return 0;
	}
	
	private int menor(int x, int y, int z) {
		return 0;
	}

}
