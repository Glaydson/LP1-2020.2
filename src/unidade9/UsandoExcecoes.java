package unidade9;

public class UsandoExcecoes {
	public static void main(String[] args) {
		try {
			lancaExcecao();
		} catch (Exception exception) { // exce��o lan�ada por throwException
			System.err.println("Exce��o tratada no m�todo main");
		}
		naoLancaExcecao();
	}

	// demonstra try...catch...finally
	public static void lancaExcecao() throws Exception {
		try { // lan�a uma exce��o e imediatamente a captura
			System.out.println("M�todo lancaExcecao");
			throw new Exception(); // gera a exce��o
		} catch (Exception exception) { // captura exce��o lan�ada em try
			System.err.println("Exce��o tratada no m�todo lancaExcecao");
			throw exception; // lan�a novamente para processamento adicional
			// o c�digo aqui n�o seria alcan�ado; poderia causar erros de compila��o
		} finally { // executa independentemente do que ocorre em try...catch
			System.err.println("Finally executado em lancaExcecao");
		}
		// o c�digo aqui n�o seria alcan�ado; poderia causar erros de compila��o
	}

	// demonstra finally quando nenhuma exce��o ocorrer
	public static void naoLancaExcecao() {
		try { // bloco try n�o lan�a uma exce��o
			System.out.println("M�todo naoLancaExcecao");
		} catch (Exception exception) { // n�o executa
			System.err.println(exception);
		} finally { // executa independentemente do que ocorre em try...catch�
			System.err.println("Finally executado em naoLancaExcecao");
		}
		System.out.println("Fim do m�todo naoLancaExcecao");
	}
}
