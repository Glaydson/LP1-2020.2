package unidade7.estudantes;

import java.time.LocalDate;

public class Estudante {
	private int matricula;
	private String nome;
	private LocalDate dataNascimento;

	// Construtor, getters, setters
	public Estudante(int matricula, String nome, LocalDate dataNascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Estudante [matricula=" + matricula + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}

}
