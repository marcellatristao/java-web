package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

/*Classe/Objeto que representa o aluno*/
public class Aluno {

	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculada;
	private boolean alunoAprovado;
	private String alunoAprovado2;
	
	/*Criando um array para alocar as disciplinas referentes ao aluno*/
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>(); //Lista de disciplinas do aluno
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	//Sempre que o new � utilizado o comando abaixo � criado vazio por padr�o
	
	public Aluno() { /*Cria os dados na memoria -  Sendo padr�o do java */
		
	}
	
	/*Recebendo dados*/
	public void setNome(String nome) {
		this.nome = nome; //this referencia para o atributo do aluno <-----
	}
	
	/*Retornando dados*/
	public String getNome() {  
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculada() {
		return serieMatriculada;
	}

	public void setSerieMatriculada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}

	
	public void setAprovado(boolean aprovado) {
		this.alunoAprovado = alunoAprovado;
	}
	
	public boolean getaprovado() {
		return alunoAprovado;
	}

	
	/*      ---------- Sempre separar os processos em m�todos ----------- */
	
	
	/*M�todo que retorna a m�dia do aluno*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();	
		}
		return somaNotas/disciplinas.size(); //size retorna quantas disciplinas tem no array
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAprovado2(){
		double media = this.getMediaNota();
		if(media >= 50) {
			if(media >= 70) {
				return "Aluno aprovado";
			}else{
				return "Aluno em Recupera��o";
			}
		}else {
			return "Aluno Reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculada="
				+ serieMatriculada + ", alunoAprovado=" + alunoAprovado + ", alunoAprovado2=" + alunoAprovado2
				+ ", disciplinas=" + disciplinas + "]";
	}
}
