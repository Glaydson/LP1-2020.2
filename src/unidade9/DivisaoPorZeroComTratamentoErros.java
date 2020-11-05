package unidade9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZeroComTratamentoErros {
	// demonstra o lan�amento de uma exce��o quando ocorre uma divis�o por zero
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador; // poss�vel divis�o por zero
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuaLoop = true; // determina se mais entradas s�o necess�rias
		do {
			try { // l� dois n�meros e calcula o quociente
				System.out.print("Por favor entre um numerador inteiro: ");
				int numerador = scanner.nextInt();
				System.out.print("Por favor entre um denominador inteiro: ");
				int denominador = scanner.nextInt();
				int resultado = quociente(numerador, denominador);
				System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
				continuaLoop = false; // entrada bem-sucedida; fim do loop
			} catch (InputMismatchException inputMismatchException) {
				System.err.printf("%nException: %s%n", inputMismatchException);
				scanner.nextLine(); // descarta entrada para o usu�rio tentar de novo
				System.out.printf("Voc� precisa digitar inteiros. Por favor tente novamente.%n%n");
			} catch (ArithmeticException arithmeticException) {
				System.err.printf("%nException: %s%n", arithmeticException);
				System.out.printf("Zero � um denominador inv�lido. Por favor tente novamente.%n%n");
			} catch (Exception e) {
				
			}
		} while (continuaLoop);
		scanner.close();
	}

}
