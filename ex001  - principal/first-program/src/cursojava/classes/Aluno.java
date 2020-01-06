package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

/*Classe/Objeto que representa o aluno*/
public class Aluno extends Pessoa{

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
		this.alunoAprovado = alunoAprovado;
	}
	
	public boolean getaprovado() {
		return alunoAprovado;
	}

	
	/*      ---------- Sempre separar os processos em métodos ----------- */
	
	
	/*Método que retorna a média do aluno*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();	
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
				return StatusAluno.APROVADO;
			}else{
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (alunoAprovado ? 1231 : 1237);
		result = prime * result + ((alunoAprovado2 == null) ? 0 : alunoAprovado2.hashCode());
		result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
		result = prime * result + ((serieMatriculada == null) ? 0 : serieMatriculada.hashCode());
		return result;
	}

	@Override /*Identifica método sobreescrito -> É um método que já existe na superclasse e está sendo sobreescrito na subclasse*/
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Aluno maior de idade" : "Aluno menor idade";
	}

	@Override
	public double salario() {
		return 1500.90;
	}
	
}
