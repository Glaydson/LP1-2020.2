package unidade4.exercicios;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Ler a quantidade de n�meros que ser� informada
		System.out.println("Entre com a quantidade de n�meros: ");
		int quantidadeNumeros = entrada.nextInt();
		
//		int[] numeros = {1,2,3,4,5, 10, 20};
		
		int[] numeros = new int[quantidadeNumeros];
		
		// O tamanho do array � sempre = length
		// Mas... o �ndice do �LTIMO elemento � sempre (length - 1)
		
		// Ler os n�meros e armazenar em um array
		for (var i = 0; i < quantidadeNumeros; i++) {
			System.out.printf("Entre com o %d� n�mero:%n", (i+1));
			numeros[i] = entrada.nextInt();
		}
		
		int menor = Integer.MAX_VALUE;
		for (var i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.printf("O menor n�mero �: %d%n", menor);
	}

}
