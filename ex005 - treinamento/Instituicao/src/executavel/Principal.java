package executavel;

import javax.swing.JOptionPane;
import classes.Aluno;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		String nome = JOptionPane.showInputDialog("Nome:");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento: ");
		String matricula = JOptionPane.showInputDialog("Matricula: ");
		String numeroCpf = JOptionPane.showInputDialog("CPF: ");

		String disciplina1 = JOptionPane.showInputDialog("1� Disciplina");
		String nota1 = JOptionPane.showInputDialog("1� Nota: ");

		String disciplina2 = JOptionPane.showInputDialog("2� Disciplina: ");
		String nota2 = JOptionPane.showInputDialog("2� Nota: ");

		String disciplina3 = JOptionPane.showInputDialog("3� Disciplina: ");
		String nota3 = JOptionPane.showInputDialog("3� Nota: ");

		aluno.setNome(nome);
		aluno.setDataNascimento(dataNascimento);
		aluno.setMatricula(matricula);
		aluno.setNumeroCpf(numeroCpf);
		
		System.out.println(aluno.toString());
	}
}