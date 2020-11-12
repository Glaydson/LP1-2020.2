package unidade10;

import java.util.Scanner;

public class TesteToken {

	public static void main(String[] args) {
		// obtém a frase
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence and press Enter");
		String sentence = scanner.nextLine();
		// processa a frase do usuário
		String[] tokens = sentence.split(" ");
		System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);
		for (String token : tokens)
			System.out.println(token);
	}

}
