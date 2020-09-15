package unidade4.exercicios;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Ler a quantidade de números que será informada
		System.out.println("Entre com a quantidade de números: ");
		int quantidadeNumeros = entrada.nextInt();
		
//		int[] numeros = {1,2,3,4,5, 10, 20};
		
		int[] numeros = new int[quantidadeNumeros];
		
		// O tamanho do array é sempre = length
		// Mas... o índice do ÚLTIMO elemento é sempre (length - 1)
		
		// Ler os números e armazenar em um array
		for (var i = 0; i < quantidadeNumeros; i++) {
			System.out.printf("Entre com o %dº número:%n", (i+1));
			numeros[i] = entrada.nextInt();
		}
		
		int menor = Integer.MAX_VALUE;
		for (var i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.printf("O menor número é: %d%n", menor);
	}

}
