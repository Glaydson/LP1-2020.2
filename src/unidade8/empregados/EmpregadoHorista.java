package unidade8.empregados;

public class EmpregadoHorista extends Empregado {

	private double salarioHora;

	private double horas;

	public EmpregadoHorista(String primeiroNome, String ultimoNome, String cpf, double salarioHora, double horas) {
		super(primeiroNome, ultimoNome, cpf);
		this.salarioHora = salarioHora;
		this.horas = horas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	@Override
	public double ganhos() {
		if (getHoras() <= 40) { // nenhuma hora extra
			return getSalarioHora() * getHoras();
		} else { return 40 * getSalarioHora() + (getHoras() - 40) * getSalarioHora() * 1.5; }
	}
	@Override
	public String toString() {
		return String.format("Empregado Horista: %s%n%s: $%,.2f; %s: %,.2f", 
		  super.toString(), "Salário por Hora",	getSalarioHora(), "Horas trabalhadas", getHoras());
	}

	@Override
	public double getValorPagamento() {
		return this.ganhos();
	}

}
