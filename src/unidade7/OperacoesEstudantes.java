package unidade7;

import java.time.LocalDate;

import unidade7.estudantes.Estudante;
import unidade7.persistencia.EstudanteDAO;

public class OperacoesEstudantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante joao = new Estudante(1, "João", LocalDate.of(2000, 5, 28));
		Estudante maria = new Estudante(2, "Maria", LocalDate.of(2010, 10, 5));
		Estudante ricardo = new Estudante(3, "Ricardo", LocalDate.of(1999, 1, 20));
		Estudante tereza = new Estudante(4, "Tereza", LocalDate.of(2002, 12, 24));
		
		EstudanteDAO dao = new EstudanteDAO();
		dao.salvar(tereza);
		dao.salvar(ricardo);
		dao.salvar(maria);
		dao.salvar(joao);
		
		dao.listarEstudantes();
		
	}

}
