package unidade9.banco.excecoes;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(int numero) {
		super("ERRO: Saldo da conta " + numero 
				+ " é insuficiente + para fazer o débito");
	}
	
	

}
