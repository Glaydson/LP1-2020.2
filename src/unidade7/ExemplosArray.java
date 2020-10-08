package unidade7;

public class ExemplosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array de tipos primitivos
		int[] valores = new int[10];
		valores[0] = 1;
		valores[1] = 2;
		
		// Inicializando com um loop
		for (int i = 0; i < valores.length; i++) {
			valores[i] = i;
		}
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();
		
		// Imprimindo com for each (enhanced for)
		for (int x: valores) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// Array de objetos
		String[] nomes = {"João", "Maria", "Pedro", "Francisca", "Teresa"};
		System.out.println(nomes.length);
		
		nomes[2] = "José";
		
		String joao = "João";
		String maria = "Maria";
		String pedro = "Pedro";
		String francisca = "Francisca";
		String teresa = "Teresa";
		
		// Array de referências
		String[] alunos = {joao, maria, pedro, francisca, teresa };

	}

}
