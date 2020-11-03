package unidade8.banco.principal;

import java.util.List;

import unidade8.banco.contas.abstrata.ContaAbstrata;
import unidade8.banco.contas.abstrata.ContaCorrente;
import unidade8.banco.contas.abstrata.ContaEspecial;
import unidade8.banco.contas.abstrata.ContaPoupanca;
import unidade8.banco.contas.interfaces.RepositorioContasMemoriaDAO;
import unidade8.banco.contas.interfaces.RepositorioDAO;

public class TesteInterfaceContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaAbstrata conta1 = new ContaCorrente(1, 100);
		ContaAbstrata conta2 = new ContaPoupanca(2, 50, 0.03);
		ContaAbstrata conta3 = new ContaEspecial(3, 300, 100, 0.10);
		ContaAbstrata conta4 = new ContaEspecial(4, 300, 100, 0.10);
		
		RepositorioDAO<ContaAbstrata> repo = new RepositorioContasMemoriaDAO();
		
		repo.salvar(conta3);
		repo.salvar(conta2);
		repo.salvar(conta1);
		//repo.salvar(conta4);
		repo.remover(conta4);
		
		for (ContaAbstrata c: repo.buscarTodos()) {
			System.out.println(c);
		}

	}

}
