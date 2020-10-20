package unidade8.banco.contas;

public class ContaCorrente {

	private final int numero;
	private double saldo;

	public ContaCorrente(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public void debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Débito de R$ " + valor + " efetuado na conta " + this.numero);
		} else {
			System.out.println("ERRO: Valor maior que o saldo. Débito não efetuado!");
		}
	}

	public void creditar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Crédito de R$ " + valor + " efetuado na conta " + this.numero);
	}

	public void transferir(ContaCorrente contaDestino, double valor) {
		this.debitar(valor);
		contaDestino.creditar(valor);
		System.out.println("O valor de R$ " + valor + " foi transferido da conta " + this.numero + " para a conta "
				+ contaDestino.getNumero());
	}

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
		return "ContaCorrente [numero=" + numero + ", saldo=" + saldo + "]";
	}

}
