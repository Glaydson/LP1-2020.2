package unidade8.banco.contas.interfaces;

import java.util.List;

public interface RepositorioDAO<ContaAbstrata> {
	
	// static ArrayList contas = new ArrayList<>();
	
	// Por padrão, qualquer método de uma interface é
	// public abstract
	
	// É possível definir métodos implementados, usando 
	// a palavra reservada default
	
	void salvar(ContaAbstrata conta);
	
	List<ContaAbstrata> buscarTodos();
	
	void remover(ContaAbstrata conta);

}
