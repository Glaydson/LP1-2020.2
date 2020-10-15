package javalandia.principal;

import java.time.LocalDate;

import javalandia.contribuintes.Contribuinte;
import javalandia.persistencia.ContribuinteDAO;

public class CalculaBeneficios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contribuinte joao = new Contribuinte("João da Silva", "001-X", LocalDate.of(2012, 04, 25), true, 0.11, 5500);
		Contribuinte maria = new Contribuinte("Maria Cunha", "002-9", LocalDate.of(2011, 06, 30), true, 0.10, 3000);
		Contribuinte manoel = new Contribuinte("Manoel José", "003-4", LocalDate.of(1978, 06, 30), true, 0.08, 1500);
		Contribuinte mariana = new Contribuinte("Mariana Lima", "004-X", LocalDate.of(2000, 9, 10), false, 0.10, 2000);
		
//		joao.imprimirContribuicaoMensal();
//		maria.imprimirContribuicaoMensal();
//		manoel.imprimirContribuicaoMensal();

		ContribuinteDAO dao = new ContribuinteDAO();
		dao.salvar(mariana);
		dao.salvar(manoel);
		dao.salvar(maria);
		dao.salvar(joao);
		
		imprimirTodosContribuintes(dao);
		
		dao.remover(manoel);
		
		imprimirTodosContribuintes(dao);
		
	}

	private static void imprimirTodosContribuintes(ContribuinteDAO dao) {
		for (Contribuinte c: dao.buscarTodos()) {
			System.out.println(c);
		}
	}
}
