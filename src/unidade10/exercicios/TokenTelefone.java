package unidade10.exercicios;

import java.util.Scanner;

public class TokenTelefone {

	public static void main(String[] args) {
		// obtém o número de telefone
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de telefone no formato (55)5555-5555 e tecle Enter");
		String numero = scanner.nextLine();

		// Usando StringBuilder
		StringBuilder numeroTel = new StringBuilder(numero);
		numeroTel.setCharAt(0, ' ');
		numeroTel.setCharAt(3, ' ');
		numeroTel.setCharAt(8, ' ');

		// Usando o método append de StringBuilder
		StringBuilder numeroTel2 = new StringBuilder();
		numeroTel2.append(numero.substring(1, 3)).append(numero.substring(4, 8)).append(numero.substring(9));
		System.out.println(numeroTel2);

		// Usando método suhstring para criar uma nova string
		String numeroTel3 = numero.substring(1, 3).concat(numero.substring(4, 8)).concat(numero.substring(9));
		System.out.println(numeroTel3);
		System.out.println( numero.replaceFirst("\\(", "*").replaceFirst("\\)", "*").replaceFirst("\\-", "*"));

		String[] tokens = numero.replaceFirst("\\(", "*").replaceFirst("\\)", "*").replaceFirst("\\-", "*")
				.split(("\\(*"));

		for (String t : tokens) {
			System.out.println(t);
		}
	}

}
