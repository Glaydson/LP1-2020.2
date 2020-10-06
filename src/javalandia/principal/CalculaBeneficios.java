package javalandia.principal;

import java.time.LocalDate;

import javalandia.contribuintes.Contribuinte;

public class CalculaBeneficios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contribuinte joao = new Contribuinte("João da Silva", "001-X", LocalDate.of(2012, 04, 25), true, 0.11, 5500);
		Contribuinte maria = new Contribuinte("Maria Cunha", "002-9", LocalDate.of(2011, 06, 30), true, 0.10, 3000);
		Contribuinte manoel = new Contribuinte("Manoel José", "003-4", LocalDate.of(1978, 06, 30), true, 0.08, 1500);
		
		joao.imprimirContribuicaoMensal();
		maria.imprimirContribuicaoMensal();
		manoel.imprimirContribuicaoMensal();

	}
}
