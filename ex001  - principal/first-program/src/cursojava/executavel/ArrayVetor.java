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
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d: arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina: " +d.getDisciplina());
				
				for (int posNota = 0; posNota < d.getNota().length; posNota++) {
					System.out.println("A nota " +(posNota+1)+ " é " +d.getNota()[posNota]);
				}
			}
		}
		
		/*------------------Descobrindo maior nota e menor nota--------------------*/
		
		/*System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " +aluno.getNomeEscola());
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("\nDisciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			double notaMax = 0.0;
			double notaMin = 0.0;
			
			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota: " +(pos+1)+ " é igual = " +d.getNota()[pos]);
				
				if(pos == 0 ) {
					notaMax = d.getNota()[pos];
				
				}else if (d.getNota()[pos] > notaMax){
						notaMax = d.getNota()[pos];		
				}
			}
			
			for (int pos = 0; pos < d.getNota().length; pos++) {
				if(pos == 0 ) {
					notaMin = d.getNota()[pos];
				
				}else if(d.getNota()[pos] < notaMin) {
					notaMin = d.getNota()[pos];
				}
			}
			
				System.out.println("A maior nota da Disciplina = " + d.getDisciplina() + "e de valor: " +notaMax);
				System.out.println("A menor nota da Disciplina = " + d.getDisciplina() + "e de valor: " +notaMin);
		}*/
	}
}