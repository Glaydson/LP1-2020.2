package unidade9.banco.principal;

import unidade9.banco.contas.ContaAbstrata;
import unidade9.banco.contas.ContaCorrente;
import unidade9.banco.contas.ContaEspecial;
import unidade9.banco.contas.ContaPoupanca;
import unidade9.banco.excecoes.ContaJaExistenteException;
import unidade9.banco.excecoes.SaldoInsuficienteException;
import unidade9.banco.persistencia.RepositorioContasMemoriaDAO;
import unidade9.banco.persistencia.RepositorioDAO;

public class TesteInterfaceContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaAbstrata conta1 = new ContaCorrente(1, 100);
		ContaAbstrata conta2 = new ContaPoupanca(2, 50, 0.03);
		ContaAbstrata conta3 = new ContaEspecial(3, 300, 100, 0.10);
		ContaAbstrata conta4 = new ContaEspecial(4, 300, 100, 0.10);

		RepositorioDAO<ContaAbstrata> repo = new RepositorioContasMemoriaDAO();
		try {
			repo.salvar(conta3);
			repo.salvar(conta2);
			repo.salvar(conta1);
			//repo.salvar(conta1);
			// repo.salvar(conta4);
			repo.remover(conta4);
			conta1.debitar(101);
		} catch (ContaJaExistenteException e) {
			System.err.println(e.getMessage());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}

		for (ContaAbstrata c : repo.buscarTodos()) {
			System.out.println(c);
		}

	}

}
