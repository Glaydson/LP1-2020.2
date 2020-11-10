package unidade9.banco.contas;

import unidade9.banco.excecoes.SaldoInsuficienteException;

public abstract class ContaAbstrata {

	private final int numero;
	private double saldo;

	public ContaAbstrata(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Crédito de R$ " + valor + " efetuado na conta " + this.numero);
	}

	public void transferir(ContaCorrente contaDestino, double valor) throws SaldoInsuficienteException {
		this.debitar(valor);
		contaDestino.creditar(valor);
		System.out.println("O valor de R$ " + valor + " foi transferido da conta " + this.numero + " para a conta "
				+ contaDestino.getNumero());
	}

	public abstract void debitar(double valor) throws SaldoInsuficienteException;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "ContaAbstrata [numero=" + numero + ", saldo=" + saldo + "]";
	}

}
