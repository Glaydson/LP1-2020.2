package unidade3;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		// Criar uma inst�ncia do Scanner para ler os n�meros
		Scanner entrada = new Scanner(System.in);

		int numero1, numero2; // Declara��o (n�o pode usar ainda)

		// L� o primeiro n�mero a ser somado
		System.out.print("Entre com o primeiro n�mero: ");
		numero1 = entrada.nextInt();

		// L� o segundo n�mero a ser somado
		System.out.print("Entre com o segundo n�mero: ");
		numero2 = entrada.nextInt();

		System.out.println("A soma �: " + (numero1 + numero2));
		System.out.printf("A soma �: %d%n", (numero1 + numero2));

	}

}
