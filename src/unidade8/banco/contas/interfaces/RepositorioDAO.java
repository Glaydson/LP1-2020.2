package unidade8.banco.contas.interfaces;

import java.util.ArrayList;

import unidade8.banco.contas.abstrata.ContaAbstrata;

public interface RepositorioDAO<T extends ContaAbstrata> {
	
	//private static ArrayList<T> contas = new ArrayList<>();
	
	void salvar(T);
	
	ArrayList<T> buscarTodos();
	
	void remover(T);

}
