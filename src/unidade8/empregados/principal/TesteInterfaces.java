package unidade8.empregados.principal;

import java.util.ArrayList;

import unidade8.empregados.EmpregadoAssalariado;
import unidade8.fatura.Fatura;
import unidade8.interfaces.Pagavel;

public class TesteInterfaces {

	public static void main(String[] args) {

		ArrayList<Pagavel> objetosPagaveis = new ArrayList();
		objetosPagaveis.add(new Fatura("1234", "assento", 2, 375.0));
		objetosPagaveis.add(new Fatura("5678", "pneu", 4, 80.0));
		objetosPagaveis.add(new EmpregadoAssalariado("João", "Smith", "111.111.111-11", 800.0));
		objetosPagaveis.add(new EmpregadoAssalariado("Lisa", "Stanfield", "222.222.222-22", 1200.0));

		// Processa os objetos polimorficamente
		for (Pagavel objetoAtual : objetosPagaveis) {
			System.out.printf("%n%s %n%s: R$ %.2f%n", objetoAtual.toString(), "Pagamento devido",
					objetoAtual.getValorPagamento());
		}

	}

}
