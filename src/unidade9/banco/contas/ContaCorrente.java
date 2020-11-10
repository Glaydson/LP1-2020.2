package unidade9.banco.contas;

import unidade9.banco.excecoes.SaldoInsuficienteException;

public class ContaCorrente extends ContaAbstrata {

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void debitar(double valor) throws SaldoInsuficienteException {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Débito de R$ " + valor + " efetuado na conta " + this.getNumero());
		} else {
			throw new SaldoInsuficienteException(this.getNumero());
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [getSaldo()=" + getSaldo() + ", getNumero()=" + getNumero() + "]";
	}

	
}
