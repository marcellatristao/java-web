package cursojava.classes;

/*Classe/Objeto que representa o aluno*/
public class Aluno {

	public String nome;
	public int idade;
	public String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculada;
	
	//Sempre que o new � utilizado o comando abaixo � criado vazio por padr�o
	
	public Aluno(String nomePadrao) {/*Cria os dados na memoria -  Sendo padr�o do java */
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao,int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*M�todos setters e getters*/
	
	//SET = adicionar ou receber os atributo
	//GET = resgatar ou obter o valor do atributo
	
	public void setNome(String nome) {
		this.nome = nome; //this referencia para o atributo do aluno <-----
	}
}
