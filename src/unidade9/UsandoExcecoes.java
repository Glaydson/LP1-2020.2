package unidade9;

public class UsandoExcecoes {
	public static void main(String[] args) {
		try {
			lancaExcecao();
		} catch (Exception exception) { // exceção lançada por throwException
			System.err.println("Exceção tratada no método main");
		}
		naoLancaExcecao();
	}

	// demonstra try...catch...finally
	public static void lancaExcecao() throws Exception {
		try { // lança uma exceção e imediatamente a captura
			System.out.println("Método lancaExcecao");
			throw new Exception(); // gera a exceção
		} catch (Exception exception) { // captura exceção lançada em try
			System.err.println("Exceção tratada no método lancaExcecao");
			throw exception; // lança novamente para processamento adicional
			// o código aqui não seria alcançado; poderia causar erros de compilação
		} finally { // executa independentemente do que ocorre em try...catch
			System.err.println("Finally executado em lancaExcecao");
		}
		// o código aqui não seria alcançado; poderia causar erros de compilação
	}

	// demonstra finally quando nenhuma exceção ocorrer
	public static void naoLancaExcecao() {
		try { // bloco try não lança uma exceção
			System.out.println("Método naoLancaExcecao");
		} catch (Exception exception) { // não executa
			System.err.println(exception);
		} finally { // executa independentemente do que ocorre em try...catchÿ
			System.err.println("Finally executado em naoLancaExcecao");
		}
		System.out.println("Fim do método naoLancaExcecao");
	}
}
