package unidade8.banco.contas.abstrata;

public class ContaCorrente extends ContaAbstrata {

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void debitar(double valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Débito de R$ " + valor + " efetuado na conta " + this.getNumero());
		} else {
			System.out.println("ERRO: Valor maior que o saldo. Débito não efetuado!");
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [getSaldo()=" + getSaldo() + ", getNumero()=" + getNumero() + "]";
	}

	
}
