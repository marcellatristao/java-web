package cursojava.classes;

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
	
	//Sempre que o new � utilizado o comando abaixo � criado vazio por padr�o
	
	public Aluno() { /*Cria os dados na memoria -  Sendo padr�o do java */
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao,int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*M�todos setters e getters*/
	
	//SET = adicionar ou receber os atributo
	//GET = resgatar ou obter o valor do atributo
	
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
	
	
}
