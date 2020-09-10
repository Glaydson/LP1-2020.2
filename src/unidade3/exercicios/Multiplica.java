package unidade3.exercicios;

import java.util.Scanner;

public class Multiplica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, numero3;

		System.out.println("Entre o primeiro inteiro: ");
		numero1 = entrada.nextInt();

		System.out.println("Entre o segundo inteiro: ");
		numero2 = entrada.nextInt();

		System.out.println("Entre o terceiro inteiro: ");
		numero3 = entrada.nextInt();

		System.out.printf("O produto de %d por %d por %d é: %d%n", numero1, numero2, numero3,
				(numero1 * numero2 * numero3));

		System.out.println("O produto de " + numero1 + " por " + numero2 + " por " + numero3 + " é: "
				+ (numero1 * numero2 * numero3));

		// CTRL + SHIFT + F = Formata o documento com base nos padrões
		// Ctrl + SHIFT + / = Coloca comentários no bloco selecionado
		// CTRL + SHIFT + \ = Retira comentários no bloco selecionado
		// CTRL 7 = Comenta/Descomenta a linha selecionada
		// CTRL + S = Salva o arquivo atual

	}

}
