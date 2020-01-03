package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		// new Aluno() � uma instancia/ cria��o de um objeto!!
		// aluno1 � uma refer�ncia para o aluno
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		  
		for(int qtd=1; qtd<=2; qtd++) {
		  String nome = JOptionPane.showInputDialog("NOME DO ALUNO "+qtd+" ?"); 
		  String idade = JOptionPane.showInputDialog("IDADE: "); 
		  String dataNascimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO: "); 
		  String registroGeral = JOptionPane.showInputDialog("RG: "); 
		  String numeroCpf =JOptionPane.showInputDialog("CPF: "); 
		  String nomeMae = JOptionPane.showInputDialog("NOME DA M�E: "); 
		  String nomePai = JOptionPane.showInputDialog("NOME DO PAI: " ); 
		  String dataMatricula = JOptionPane.showInputDialog("DATA MATRICULA: "); 
		  String nomeEscola = JOptionPane.showInputDialog("NOME DA ESCOLA: "); 
		  String serieMatriculada = JOptionPane.showInputDialog("SERIE MATRICULADA: ");
		  
		  Aluno aluno1 = new Aluno(); //Objeto aluno 1
		  
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
		  
		  /*Recebendo as 4 notas de forma din�mica*/
		  for (int pos = 1; pos<=4; pos++) {
			  String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: "+pos+" ?");
			  String notaDisciplina = JOptionPane.showInputDialog("Nota: "+pos+" ?");
			  
			  Disciplina disciplina = new Disciplina();
			  disciplina.setDisciplina(nomeDisciplina);
			  
			  disciplina.setNota(Double.valueOf(notaDisciplina));
			  
			  aluno1.getDisciplinas().add(disciplina);
		  }
		  
		  /*Remover disciplinas da lista*/
		  int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		  
			if(escolha == 0) {
				
				int continuarRemover = 0;
				int posicao = 1;
				while(continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4 ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -posicao); 
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					
				}
			}
			alunos.add(aluno1);
	}
			
		  for (Aluno aluno : alunos) { //representa cada um dos alunos
			  System.out.println(aluno); //Descri��o d objeto na mem�ria
			  System.out.println("Media do aluno: " +aluno.getMediaNota());
			  System.out.println("Resultado = " +aluno.getAlunoAprovado2());
			  System.out.println("\n-------------------------------------------\n");
		}	
	}
}
