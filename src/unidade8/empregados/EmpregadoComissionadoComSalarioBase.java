package unidade8.empregados;

public class EmpregadoComissionadoComSalarioBase extends EmpregadoComissionado {

	private double salarioBase;

	public EmpregadoComissionadoComSalarioBase(String primeiroNome, String ultimoNome, String cpf, double vendasBrutas,
			double percentualComissao, double salarioBase) {
		super(primeiroNome, ultimoNome, cpf, vendasBrutas, percentualComissao);
		this.salarioBase = salarioBase;
	}

	@Override
	public double ganhos() {
		return super.ganhos() + this.salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return String.format("%s%n%s%n%s: %.2f", "Empregado com salário base", 
				super.toString(), "Salário Base", getSalarioBase());
	}

}
