package unidade8.empregados;

public abstract class Empregado {

	private final String primeiroNome;
	private final String ultimoNome;
	private final String cpf;

	public Empregado(String primeiroNome, String ultimoNome, String cpf) {
		super();
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.cpf = cpf;
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
		return String.format("%s %s%nNúmero do CPF: %s", getPrimeiroNome(), getUltimoNome(), getCpf());
	}

	public abstract double ganhos();

}
