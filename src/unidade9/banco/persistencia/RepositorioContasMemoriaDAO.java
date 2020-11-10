package unidade9.banco.persistencia;

import java.util.ArrayList;
import java.util.List;

import unidade9.banco.contas.ContaAbstrata;
import unidade9.banco.excecoes.ContaJaExistenteException;

public class RepositorioContasMemoriaDAO implements RepositorioDAO<ContaAbstrata> {

	private List<ContaAbstrata> contas = new ArrayList<>();

	@Override
	public void salvar(ContaAbstrata conta) throws ContaJaExistenteException {
		ContaAbstrata c = this.buscarPeloNumero(conta.getNumero());
		if (c == null) { // A conta não existe
			contas.add(conta);
			System.out.println("A conta " + conta.getNumero() + " foi cadastrada.");
		} else {
			throw new ContaJaExistenteException(conta.getNumero());
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
			System.out.println("ERRO AO REMOVER: Conta " + conta.getNumero() + " não existe.");
		}
	}

}
