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
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private boolean aprovado;
	
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	public boolean getaprovado() {
		return aprovado;
	}

	
	/*      ---------- Sempre separar os processos em m�todos ----------- */
	
	
	/*M�todo que retorna a m�dia do aluno*/
	public double getMediaNota() {
		return(nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	public boolean getAprovado() {
		double media = this.getMediaNota();
		if(media >= 60) {
			return true;
		}else {
			return false;
		}
	}
}
