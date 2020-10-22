package unidade8.empregados.principal;

import java.util.ArrayList;

import unidade8.empregados.Empregado;
import unidade8.empregados.EmpregadoAssalariado;
import unidade8.empregados.EmpregadoComissionado;
import unidade8.empregados.EmpregadoComissionadoComSalarioBase;
import unidade8.empregados.EmpregadoHorista;

public class TesteEmpregadosAbstrato {

	public static void main(String[] args) {
		// cria 4 empregados concretos
		EmpregadoAssalariado assalariado = new EmpregadoAssalariado("Doutor", "Smith", "111.111.111-11", 800.00);
		EmpregadoHorista horista = new EmpregadoHorista("Karen", "Price", "222.222.222-22", 16.75, 40);
		EmpregadoComissionado comissionado = new EmpregadoComissionado("Suelen", "Jones", "333.333.333-33", 10000, .06);
		EmpregadoComissionadoComSalarioBase comissionadoComSalarioBase = new EmpregadoComissionadoComSalarioBase(
				"Roberto", "Lima", "444.444.444-44", 5000, .04, 300);

		ArrayList<Empregado> empregados = new ArrayList<>();
		empregados.add(assalariado);
		empregados.add(horista);
		empregados.add(comissionado);
		empregados.add(comissionadoComSalarioBase);

		for (Empregado e : empregados) {
			System.out.println(e);
			// Determina se o empregado é um comissionado com salário base
			if (e instanceof EmpregadoComissionadoComSalarioBase) {
				// faz o "downcast" de Empregado para EmpregadoComissionadoComSalarioBase
				EmpregadoComissionadoComSalarioBase emp = 
						(EmpregadoComissionadoComSalarioBase) e;
				// Aplica reajuste de 10% no salário base
				emp.setSalarioBase(emp.getSalarioBase() * 1.10);
				System.out.printf
					("Novo salário base com acréscimo de 10%% é: R$%,.2f%n", emp.getSalarioBase());
			}
			// Ligação dinâmica ou Dynamic Binding
			System.out.printf("Ganhos R$%,.2f%n%n", e.ganhos());
		}
		
		// Obtém o tipo de cada objeto no array empregados
        for (Empregado e : empregados) {
        	System.out.printf("Empregado %d é um %s%n", 
        			empregados.indexOf(e), e.getClass().getName());
        }


	}

}
