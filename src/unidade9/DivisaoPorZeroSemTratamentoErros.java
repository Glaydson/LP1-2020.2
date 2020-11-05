package unidade9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DivisaoPorZeroSemTratamentoErros {

	// demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
	public static int quociente(int numerador, int denominador) {
		return numerador / denominador; // possível divisão por zero
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Por favor entre um numerador inteiro: ");
		int numerador = scanner.nextInt();
		System.out.print("Por favor entre um denominador inteiro: ");
		int denominador = scanner.nextInt();

		int resultado = quociente(numerador, denominador);
		System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
		scanner.close();
		
		try {
			PrintWriter arquivo = new PrintWriter("lista.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (resultado != 5) {
			throw new RuntimeException("Deu ruim");
		}
	}

}
