package unidade7.persistencia;

import java.util.ArrayList;

import unidade7.estudantes.Estudante;

public class EstudanteDAO {

	private ArrayList<Estudante> estudantes = new ArrayList<>();

	public void salvar(Estudante e) {
		estudantes.add(e);
		System.out.printf("Estudante %s adicionado!%n", e.getNome());
		System.out.printf("A lista agora tem %d estudantes!%n", estudantes.size());
	}

	public ArrayList<Estudante> buscarTodos() {
		return estudantes;
	}

	public Estudante buscarPeloIndice(int indice) {
		return estudantes.get(indice);
	}

	public void remover(Estudante e) {
		estudantes.remove(e);
		System.out.printf("Estudante %s removido!%n", e.getNome());
		System.out.printf("A lista agora tem %d estudantes!%n", estudantes.size());
	}

	public void remover(int indice) {
		// estudantes.remove(indice);
		Estudante e = this.buscarPeloIndice(indice);
		this.remover(e);
	}

	public void listarEstudantes() {
		System.out.println("LISTAGEM DOS ESTUDANTES");
		for (Estudante e : estudantes) {
			System.out.println(e);
		}
	}

}
