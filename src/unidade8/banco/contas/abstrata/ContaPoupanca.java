package unidade8.banco.contas.abstrata;

import unidade8.banco.contas.abstrata.ContaCorrente;

public class ContaPoupanca extends ContaCorrente {

	private double taxaRendimento;

	public ContaPoupanca(int numero, double saldo, double taxaRendimento) {
		super(numero, saldo);
		this.taxaRendimento = taxaRendimento;
	}

	public void acumularRendimento() {
		double rendimento = this.getSaldo() * this.taxaRendimento;
		this.creditar(rendimento);
		System.out.println("O rendimento de R$ " + rendimento + " foi creditado na conta " + this.getNumero());
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [taxaRendimento=" + taxaRendimento + ", getSaldo()=" + getSaldo() + ", getNumero()="
				+ getNumero() + "]";
	}

}
