package unidade8.empregados;

public class EmpregadoComissionado extends Empregado {

	private double vendasBrutas;
	private double percentualComissao;

	public EmpregadoComissionado(String primeiroNome, String ultimoNome, String cpf, double vendasBrutas,
			double percentualComissao) {
		super(primeiroNome, ultimoNome, cpf);
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

	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
				 "Empregado Comissionado", super.toString(),
				 "Vendas Brutas", getVendasBrutas(), 
				 "Taxa de comissão", getPercentualComissao()); 
	}

}
