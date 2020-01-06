package cursojava.executavel;
import java.util.Arrays;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	/*Utilizado para executar código*/
	public static void main(String[] args) {
		
		double[] notas = {88, 95, 62};
		double[] notasLogica= {75, 64, 72};
		
		
		/*Instanciação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("João Batista");
		aluno.setNomeEscola("JDev Treinamento");
		
		/*Instanciação das disciplinas*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
	}
}