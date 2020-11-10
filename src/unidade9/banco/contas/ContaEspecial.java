package unidade9.banco.contas;

import unidade9.banco.excecoes.SaldoInsuficienteException;

public class ContaEspecial extends ContaAbstrata {

	private double limite;
	private double taxaJuros;

	public ContaEspecial(int numero, double saldo, double limite, double taxaJuros) {
		super(numero, saldo);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
	}

	@Override
	public void debitar(double valor) throws SaldoInsuficienteException {
		if (valor <= (this.getSaldo() + this.limite)) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Débito de R$ " + valor + " efetuado na conta " + this.getNumero());
		} else {
			throw new SaldoInsuficienteException(this.getNumero());
		}

	}

	public void cobrarJuros() throws SaldoInsuficienteException {
		if (this.getSaldo() < 0) {
			double juros = -1 * (this.getSaldo() * this.taxaJuros);
			this.debitar(juros);
			System.out.println("Foram debitados juros no valor de R$ " + juros + " na conta " + this.getNumero());
		} else {
			System.out.println("Não há juros a serem cobrados na conta " + this.getNumero());
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", taxaJuros=" + taxaJuros + ", getSaldo()=" + getSaldo()
				+ ", getNumero()=" + getNumero() + "]";
	}

}
