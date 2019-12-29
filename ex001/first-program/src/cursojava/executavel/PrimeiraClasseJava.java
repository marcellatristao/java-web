package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		// new Aluno() é uma instancia/ criação de um objeto!!

		// aluno1 é uma referência para o aluno

		
		  Aluno aluno1 = new Aluno(); /*Objeto aluno 1*/
		  
		  String nome = JOptionPane.showInputDialog("NOME: "); String idade =
		  JOptionPane.showInputDialog("IDADE: "); String dataNascimento =
		  JOptionPane.showInputDialog("DATA DE NASCIMENTO: "); String registroGeral =
		  JOptionPane.showInputDialog("RG: "); String numeroCpf =
		  JOptionPane.showInputDialog("CPF: "); String nomeMae =
		  JOptionPane.showInputDialog("NOME DA MÃE: "); String nomePai =
		  JOptionPane.showInputDialog("NOME DO PAI: " ); String dataMatricula =
		  JOptionPane.showInputDialog("DATA MATRICULA: "); String nomeEscola =
		  JOptionPane.showInputDialog("NOME DA ESCOLA: "); String serieMatriculada =
		  JOptionPane.showInputDialog("SERIE MATRICULADA: ");
		  
		  String nota1 = JOptionPane.showInputDialog("NOTA 1: "); String nota2 =
		  JOptionPane.showInputDialog("NOTA 2: "); String nota3 =
		  JOptionPane.showInputDialog("NOTA 3: "); String nota4 =
		  JOptionPane.showInputDialog("NOTA 4: ");
		  
		  aluno1.setNome(nome); aluno1.setIdade(Integer.valueOf(idade));
		  aluno1.setDataNascimento(dataNascimento);
		  aluno1.setRegistroGeral(registroGeral); 
		  aluno1.setNumeroCpf(numeroCpf);
		  aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
		  aluno1.setDataMatricula(dataMatricula); 
		  aluno1.setNomeEscola(nomeEscola);
		  aluno1.setSerieMatriculada(serieMatriculada);
		  aluno1.setNota1(Double.parseDouble(nota1));
		  aluno1.setNota2(Double.parseDouble(nota2));
		  aluno1.setNota3(Double.parseDouble(nota3));
		  aluno1.setNota4(Double.parseDouble(nota4));
		 
		  System.out.println(aluno1.toString()); /*Descrição d objeto na memória*/
		  System.out.println("Media do aluno: " +aluno1.getMediaNota());
		  
		  
	}
}
