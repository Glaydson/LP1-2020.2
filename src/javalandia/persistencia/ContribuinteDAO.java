package javalandia.persistencia;

import java.util.ArrayList;

import javalandia.contribuintes.Contribuinte;

public class ContribuinteDAO {

	private ArrayList<Contribuinte> contribuintes = new ArrayList<>();

	public void salvar(Contribuinte c) {
		contribuintes.add(c);
		System.out.println("Contribuinte " + c.getNome() + " gravado!");
	}

	public ArrayList<Contribuinte> buscarTodos() {
		return contribuintes;
	}

	public void remover(Contribuinte c) {
		if (contribuintes.contains(c)) {
			contribuintes.remove(c);
			System.out.println("Contribuinte " + c.getNome() + " Removido!");
		} else {
			System.out.println("Contribuinte " + c.getNome() + " não encontrado!");
		}
	}

}
