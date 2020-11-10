package unidade9.banco.persistencia;

import java.util.List;

import unidade9.banco.excecoes.ContaJaExistenteException;

public interface RepositorioDAO<ContaAbstrata> {
	
	// static ArrayList contas = new ArrayList<>();
	
	// Por padrão, qualquer método de uma interface é
	// public abstract
	
	// É possível definir métodos implementados, usando 
	// a palavra reservada default
	
	void salvar(ContaAbstrata conta) throws ContaJaExistenteException;
	
	List<ContaAbstrata> buscarTodos();
	
	void remover(ContaAbstrata conta);

}
