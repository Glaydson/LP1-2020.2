package unidade8.empregados.principal;

import java.util.ArrayList;

import unidade8.empregados.EmpregadoComissionado;
import unidade8.empregados.EmpregadoComissionadoComSalarioBase;

public class TesteEmpregados {

	public static void main(String[] args) {
		// Cria um ArrayList de Empregados
		ArrayList<EmpregadoComissionado> empregados = new ArrayList<>();

		// cria um empregado comissionado
		EmpregadoComissionado empregado1 = new EmpregadoComissionado("Suzana", "Jones", "222.222.222-22", 10000, .06);
		empregado1.setVendasBrutas(5000);
		empregado1.setPercentualComissao(.10);
//		System.out.printf("%s", empregado1);

		// cria um empregado comissionado com salário base
		EmpregadoComissionadoComSalarioBase empregado2 = new EmpregadoComissionadoComSalarioBase("Roberto", "Lima",
				"333.333.333-33", 5000, 0.04, 300);
		empregado2.setSalarioBase(500);
//		System.out.printf("%n%n%s", empregado2);
		
		empregados.add(empregado1);
		empregados.add(empregado2);
		
		for(EmpregadoComissionado e: empregados) {
			System.out.printf("%s%n%n", e);
		}

	}

}
