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

		String disciplina1 = JOptionPane.showInputDialog("1ª Disciplina");
		String nota1 = JOptionPane.showInputDialog("1ª Nota: ");

		String disciplina2 = JOptionPane.showInputDialog("2ª Disciplina: ");
		String nota2 = JOptionPane.showInputDialog("2ª Nota: ");

		String disciplina3 = JOptionPane.showInputDialog("3ª Disciplina: ");
		String nota3 = JOptionPane.showInputDialog("3ª Nota: ");

		aluno.setNome(nome);
		aluno.setDataNascimento(dataNascimento);
		aluno.setMatricula(matricula);
		aluno.setNumeroCpf(numeroCpf);
		
		System.out.println(aluno.toString());
	}
}