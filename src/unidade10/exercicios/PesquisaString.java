package unidade10.exercicios;

import java.util.Scanner;

public class PesquisaString {

	public static void main(String[] args) {
		/**
		 * Elabore um aplicativo que insere uma linha de texto e um caractere de
		 * pesquisa e utiliza o metodo String indexOf para determinar o numero de
		 * ocorrencias do caractere no texto.
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com a linha de texto: ");
		String linha = entrada.nextLine();
		System.out.print("Entre com o caractere a ser pesquisado:");
		String caractere = entrada.nextLine();
		try {
			if (caractere.length() > 1) {
				throw new Exception("Digite somente um caractere para pesquisar");
			}
			String stringPesquisa = linha;
			int contador = 0;
			while (stringPesquisa.indexOf(caractere) != -1) {
				contador++;
				int indice = stringPesquisa.indexOf(caractere);
				stringPesquisa = stringPesquisa.substring(indice + 1);
			}
			System.out.println("O caractere \'" + caractere + "\' aparece na String \'" + linha + "\' " + contador + " vezes.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			entrada.close();
		}
		

	}

}
