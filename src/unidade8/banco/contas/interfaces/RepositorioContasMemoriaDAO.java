package unidade8.banco.contas.interfaces;

import java.util.ArrayList;
import java.util.List;

import unidade8.banco.contas.abstrata.ContaAbstrata;

public class RepositorioContasMemoriaDAO implements RepositorioDAO<ContaAbstrata> {

	private List<ContaAbstrata> contas = new ArrayList<>();

	@Override
	public void salvar(ContaAbstrata conta) {
		ContaAbstrata c = this.buscarPeloNumero(conta.getNumero());
		if (c == null) { // A conta não existe
			contas.add(conta);
			System.out.println("A conta " + conta.getNumero() + " foi cadastrada.");
		} else {
			System.out.println("ERRO AO SALVAR: Conta " 
					+ conta.getNumero() + " já existe.");
		}

	}

	@Override
	public List<ContaAbstrata> buscarTodos() {
		return contas;
	}

	private ContaAbstrata buscarPeloNumero(int numero) {
		for (ContaAbstrata c : contas) {
			if (c.getNumero() == numero) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void remover(ContaAbstrata conta) {
		ContaAbstrata c = this.buscarPeloNumero(conta.getNumero());
		if (c != null) { // Conta existe, pode remover
			contas.remove(conta);
			System.out.println("A conta " + conta.getNumero() + " foi removida.");
		} else {
			System.out.println("ERRO AO REMOVER: Conta " 
					+ conta.getNumero() + " não existe.");
		}
	}

}
