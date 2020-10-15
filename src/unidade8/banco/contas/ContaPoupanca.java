package unidade8.banco.contas;

public class ContaPoupanca extends ContaCorrente {

	private double taxaRendimento;

	public ContaPoupanca(int numero, double saldo, double taxaRendimento) {
		super(numero, saldo);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [taxaRendimento=" + taxaRendimento + ", toString()=" + super.toString() + "]";
	}

}
