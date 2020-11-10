package unidade9.banco.excecoes;

public class ContaJaExistenteException extends Exception {

	public ContaJaExistenteException(int numero) {
		super("ERRO AO SALVAR: Conta " + numero + " já existe.");
	}
	
	

}
