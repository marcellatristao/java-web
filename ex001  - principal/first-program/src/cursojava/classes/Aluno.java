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
	private boolean aprovado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	//Sempre que o new é utilizado o comando abaixo é criado vazio por padrão
	
	public Aluno() { /*Cria os dados na memoria -  Sendo padrão do java */
		
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
		this.aprovado = aprovado;
	}
	
	public boolean getaprovado() {
		return aprovado;
	}

	
	/*      ---------- Sempre separar os processos em métodos ----------- */
	
	
	/*Método que retorna a média do aluno*/
	public double getMediaNota() {
		return 0;
	}
	
	public boolean getAprovado() {
		double media = this.getMediaNota();
		if(media >= 60) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculada="
				+ serieMatriculada + ", aprovado=" + aprovado + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((nome == null) ? 0 : nome.hashCode()); result =
	 * prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode()); return
	 * result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Aluno other = (Aluno) obj; if (nome == null) { if (other.nome != null)
	 * return false; } else if (!nome.equals(other.nome)) return false; if
	 * (numeroCpf == null) { if (other.numeroCpf != null) return false; } else if
	 * (!numeroCpf.equals(other.numeroCpf)) return false; return true; }
	 */
	
}
