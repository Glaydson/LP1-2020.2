package unidade8.empregados;

public class EmpregadoAssalariado extends Empregado {

	private double salario;

	public EmpregadoAssalariado(String primeiroNome, String ultimoNome, String cpf, double salario) {
		super(primeiroNome, ultimoNome, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double ganhos() {
		return this.salario;
	}

	@Override
	public String toString() {
		return String.format("Empregado Assalariado: %s%n%s: $%,.2f", super.toString(), "Salário", getSalario());
	}

	@Override
	public double getValorPagamento() {
		return this.salario;
	}

	

}
