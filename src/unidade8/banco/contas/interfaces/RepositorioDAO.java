package unidade8.banco.contas.interfaces;

import java.util.List;

public interface RepositorioDAO<ContaAbstrata> {
	
	// static ArrayList contas = new ArrayList<>();
	
	// Por padr�o, qualquer m�todo de uma interface �
	// public abstract
	
	// � poss�vel definir m�todos implementados, usando 
	// a palavra reservada default
	
	void salvar(ContaAbstrata conta);
	
	List<ContaAbstrata> buscarTodos();
	
	void remover(ContaAbstrata conta);

}
