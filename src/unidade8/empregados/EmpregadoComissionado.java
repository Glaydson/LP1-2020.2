package unidade8.empregados;

public class EmpregadoComissionado {

	private final String primeiroNome;
	private final String ultimoNome;
	private final String cpf;
	private double vendasBrutas;
	private double percentualComissao;

	public EmpregadoComissionado(String primeiroNome, String ultimoNome, String cpf, double vendasBrutas,
			double percentualComissao) {
		super();
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.cpf = cpf;
		this.vendasBrutas = vendasBrutas;
		this.percentualComissao = percentualComissao;
	}

	public double ganhos() {
		return getPercentualComissao() * getVendasBrutas();
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
				"Empregado comissionado", getPrimeiroNome(), getUltimoNome(), 
				"Número do CPF", getCpf(), "Vendas Brutas", getVendasBrutas(),
				"Percentual de Comissão", getPercentualComissao(), 
				"Ganhos", ganhos());
	}

}
