package unidade10.exercicios;

import java.util.Scanner;

public class PesquisaCaractere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre a string onde deseja fazer a pesquisa: ");
		String linha = scanner.nextLine();
		System.out.println("Entre o caractere que deseja pesquisar: ");
		String caractere = scanner.nextLine();
		
		
		try {
			if (caractere.length() != 1) {
				throw new Exception("Digite um caractere apenas");
			}
			int contador = 0;
			String stringAtual = linha;
			while (stringAtual.indexOf(caractere) != -1) {
				int indice = stringAtual.indexOf(caractere);
				contador = contador + 1;
				stringAtual = stringAtual.substring(indice + 1);
			}
			System.out.println("O caractere \'" + caractere + "\' aparece " + contador 
					+ " vezes na string \'" + linha + "\'");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
