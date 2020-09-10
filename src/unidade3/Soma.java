package unidade3;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		// Criar uma instância do Scanner para ler os números
		Scanner entrada = new Scanner(System.in);

		int numero1, numero2; // Declaração (não pode usar ainda)

		// Lê o primeiro número a ser somado
		System.out.print("Entre com o primeiro número: ");
		numero1 = entrada.nextInt();

		// Lê o segundo número a ser somado
		System.out.print("Entre com o segundo número: ");
		numero2 = entrada.nextInt();

		System.out.println("A soma é: " + (numero1 + numero2));
		System.out.printf("A soma é: %d%n", (numero1 + numero2));

	}

}
