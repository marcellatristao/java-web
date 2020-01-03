package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		if(login.equalsIgnoreCase("admin") &&
		senha.equalsIgnoreCase("admin"))
		{
		
		// new Aluno() é uma instancia/ criação de um objeto!!
		// aluno1 é uma referência para o aluno
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*lista e dentro dessa lista que tem uma chave que identifica outra lista*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>(); 
		  
		for(int qtd=1; qtd<=3; qtd++) {
		  String nome = JOptionPane.showInputDialog("NOME DO ALUNO "+qtd+" ?"); 
		  /*String idade = JOptionPane.showInputDialog("IDADE: "); 
		  String dataNascimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO: "); 
		  String registroGeral = JOptionPane.showInputDialog("RG: "); 
		  String numeroCpf =JOptionPane.showInputDialog("CPF: "); 
		  String nomeMae = JOptionPane.showInputDialog("NOME DA MÃE: "); 
		  String nomePai = JOptionPane.showInputDialog("NOME DO PAI: " ); 
		  String dataMatricula = JOptionPane.showInputDialog("DATA MATRICULA: "); 
		  String nomeEscola = JOptionPane.showInputDialog("NOME DA ESCOLA: "); 
		  String serieMatriculada = JOptionPane.showInputDialog("SERIE MATRICULADA: ");*/
		  
		  Aluno aluno1 = new Aluno(); //Objeto aluno 1
		  
		  aluno1.setNome(nome); 
		  /*aluno1.setIdade(Integer.valueOf(idade));
		  aluno1.setDataNascimento(dataNascimento);
		  aluno1.setRegistroGeral(registroGeral); 
		  aluno1.setNumeroCpf(numeroCpf);
		  aluno1.setNomeMae(nomeMae); 
		  aluno1.setNomePai(nomePai);
		  aluno1.setDataMatricula(dataMatricula); 
		  aluno1.setNomeEscola(nomeEscola);
		  aluno1.setSerieMatriculada(serieMatriculada);*/
		  
		  /*Recebendo as 4 notas de forma dinâmica*/
		  for (int pos = 1; pos<=1; pos++) {
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
		
		maps .put(StatusAluno.APROVADO, new ArrayList<Aluno>()); /*Inicializando a chave*/
		maps .put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps .put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) { /*Separação em listas*/
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}
			else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
			
		}
		
		System.out.println(">>>>  Lista dos aprovados  <<<<");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			
			System.out.println(aluno.getNome() + " Resultado = " +aluno.getAlunoAprovado2() + " com média de: " +aluno.getMediaNota());
			System.out.println("\n");
		}
		
		System.out.println(">>>>  Lista dos reprovados  <<<<");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			
			System.out.println(aluno.getNome() + " Resultado = " +aluno.getAlunoAprovado2() + " com média de: " +aluno.getMediaNota());
			System.out.println("\n");
		}
		
		System.out.println(">>>>  Lista dos em Recuperação  <<<<");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			
			System.out.println(aluno.getNome() + " Resultado = " +aluno.getAlunoAprovado2() + " com média de: " +aluno.getMediaNota());
			System.out.println("\n");
		}
	}
		
	}
}
