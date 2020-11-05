package unidade9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZeroComTratamentoErros {
	// demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador; // possível divisão por zero
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuaLoop = true; // determina se mais entradas são necessárias
		do {
			try { // lê dois números e calcula o quociente
				System.out.print("Por favor entre um numerador inteiro: ");
				int numerador = scanner.nextInt();
				System.out.print("Por favor entre um denominador inteiro: ");
				int denominador = scanner.nextInt();
				int resultado = quociente(numerador, denominador);
				System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
				continuaLoop = false; // entrada bem-sucedida; fim do loop
			} catch (InputMismatchException inputMismatchException) {
				System.err.printf("%nException: %s%n", inputMismatchException);
				scanner.nextLine(); // descarta entrada para o usuário tentar de novo
				System.out.printf("Você precisa digitar inteiros. Por favor tente novamente.%n%n");
			} catch (ArithmeticException arithmeticException) {
				System.err.printf("%nException: %s%n", arithmeticException);
				System.out.printf("Zero é um denominador inválido. Por favor tente novamente.%n%n");
			} catch (Exception e) {
				
			}
		} while (continuaLoop);
		scanner.close();
	}

}
