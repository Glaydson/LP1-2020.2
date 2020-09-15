package unidade4;

public class Juros {

	public static void main(String[] args) {
		double valor; // quantia em depósito ao fim de cada ano
		double principal = 1000.0; // quantidade inicial antes dos juros
		double taxaJ; // taxa de juros 

		// exibe cabeçalhos
		System.out.printf("%s%21s %n", "Ano", "Valor para 5%");

		// calcula o saldo após cada ano
		for (int ano = 1; ano <= 10; ++ano) {
			// Imprime o ano
			System.out.printf("%4d", ano);
			taxaJ = 5.0/100;
			// Calcula e imprime o saldo após o ano
			valor = principal * Math.pow(1.0 + taxaJ, ano);
			System.out.printf("%,20.2f", valor);
			// Salta para a próxima linha
			System.out.println();
		}
	}
}
