package unidade8.fatura;

import lombok.Data;
import unidade8.interfaces.Pagavel;

@Data
public class Fatura implements Pagavel {

	private final String numeroPeca;
	private final String descricaoPeca;
	private int quantidade;
	private double precoPorItem;

	public Fatura(String numeroPeca, String descricaoPeca, int quantidade, double precoPorItem) {
		super();
		this.numeroPeca = numeroPeca;
		this.descricaoPeca = descricaoPeca;
		this.quantidade = quantidade;
		this.precoPorItem = precoPorItem;
	}

	@Override
	public double getValorPagamento() {
		return getQuantidade() * getPrecoPorItem();
	}

	
	
}
