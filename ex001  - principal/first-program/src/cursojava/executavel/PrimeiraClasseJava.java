package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		// new Aluno() é uma instancia/ criação de um objeto!!

		// aluno1 é uma referência para o aluno

		
		  Aluno aluno1 = new Aluno(); //Objeto aluno 1
		  
		  String nome = JOptionPane.showInputDialog("NOME: "); 
		  String idade = JOptionPane.showInputDialog("IDADE: "); 
		  String dataNascimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO: "); 
		  String registroGeral = JOptionPane.showInputDialog("RG: "); 
		  String numeroCpf =JOptionPane.showInputDialog("CPF: "); 
		  String nomeMae = JOptionPane.showInputDialog("NOME DA MÃE: "); 
		  String nomePai = JOptionPane.showInputDialog("NOME DO PAI: " ); 
		  String dataMatricula = JOptionPane.showInputDialog("DATA MATRICULA: "); 
		  String nomeEscola = JOptionPane.showInputDialog("NOME DA ESCOLA: "); 
		  String serieMatriculada = JOptionPane.showInputDialog("SERIE MATRICULADA: ");
		  
		  String disciplina1 = JOptionPane.showInputDialog("DISCIPLINA 1: ");
		  String nota1 = JOptionPane.showInputDialog("NOTA 1: ");
		  
		  String disciplina2 = JOptionPane.showInputDialog("DISCIPLINA 2: ");
		  String nota2 = JOptionPane.showInputDialog("NOTA 2: "); 
		  
		  String disciplina3 = JOptionPane.showInputDialog("DISCIPLINA 3: ");
		  String nota3 = JOptionPane.showInputDialog("NOTA 3: "); 
		  
		  String disciplina4 = JOptionPane.showInputDialog("DISCIPLINA 4: ");
		  String nota4 = JOptionPane.showInputDialog("NOTA 4: ");
		  
		  aluno1.setNome(nome); 
		  aluno1.setIdade(Integer.valueOf(idade));
		  aluno1.setDataNascimento(dataNascimento);
		  aluno1.setRegistroGeral(registroGeral); 
		  aluno1.setNumeroCpf(numeroCpf);
		  aluno1.setNomeMae(nomeMae); 
		  aluno1.setNomePai(nomePai);
		  aluno1.setDataMatricula(dataMatricula); 
		  aluno1.setNomeEscola(nomeEscola);
		  aluno1.setSerieMatriculada(serieMatriculada);
		  
		  aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));/*aluno -> disciplina -> seta a nota*/
		  aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		  aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		  aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		  
		  aluno1.getDisciplina().setDisciplina1(disciplina1);
		  aluno1.getDisciplina().setDisciplina2(disciplina2);
		  aluno1.getDisciplina().setDisciplina3(disciplina3);
		  aluno1.getDisciplina().setDisciplina4(disciplina4);
		  
		  System.out.println(aluno1.toString()); //Descrição d objeto na memória
		  System.out.println("Media do aluno: " +aluno1.getMediaNota());
		 
		
		//Equals e hashcode (deferenciar e comparar objetos)
		/*
		 * Aluno aluno1 = new Aluno(); aluno1.setNome("Marcella");
		 * aluno1.setNumeroCpf("123");
		 * 
		 * Aluno aluno2 = new Aluno(); aluno2.setNome("Marcella");
		 * aluno2.setNumeroCpf("121");
		 * 
		 * if(aluno1.equals(aluno2)) { //comparando o aluno1 com o aluno2
		 * System.out.println("Alunos são iguais"); }else {
		 * System.out.println("Alunos não são iguais"); }
		 */
		
	}
}
