package unidade8.banco.principal;

import java.util.ArrayList;

import unidade8.banco.contas.abstrata.ContaAbstrata;
import unidade8.banco.contas.abstrata.ContaCorrente;
import unidade8.banco.contas.abstrata.ContaEspecial;
import unidade8.banco.contas.abstrata.ContaPoupanca;

public class TesteContasAbstratas {

	public static void main(String[] args) {

		ArrayList<ContaAbstrata> contas = new ArrayList<>();

		ContaAbstrata conta1 = new ContaCorrente(1, 100);
		ContaAbstrata conta2 = new ContaPoupanca(2, 50, 0.03);
		ContaAbstrata conta3 = new ContaEspecial(3, 300, 100, 0.10);

		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);

		// Creditar 100 reais em todas as contas
		for (ContaAbstrata c : contas) {
			c.creditar(100);
		}

		// Debitar 10 reais em todas as contas
		for (ContaAbstrata c : contas) {
			c.debitar(10);
		}

		for (ContaAbstrata c : contas) {
			System.out.println(c);
		}

	}

}
