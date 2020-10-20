package unidade8.banco.principal;

import unidade8.banco.contas.ContaCorrente;
import unidade8.banco.contas.ContaEspecial;
import unidade8.banco.contas.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente(1, 100);
		ContaPoupanca conta2 = new ContaPoupanca(2, 50, 0.03);
		ContaEspecial conta3 = new ContaEspecial(3, 300, 100, 0.10);

//		conta1.debitar(50);
//		conta2.debitar(51);
//		conta3.debitar(350);
//		conta3.creditar(40);
		
		conta1.transferir(conta2, 10);
		conta2.transferir(conta3, 5);
		conta3.transferir(conta1, 15);
		conta3.transferir(conta2, 300);
		
		conta2.acumularRendimento();
		conta3.cobrarJuros();
		
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
	}

}
