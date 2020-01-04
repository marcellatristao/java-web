package cursojava.classes;

/*Heran�a - Superclasse*/
public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;
	
	/*M�todo abstrato que fica na classe pai � obrigat�rio nas clsses filhas*/
	public abstract double salario(); /*M�todo abstrato n�o definido ----> polimorfismo*/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	/*Retorna true casp seja 18 anos para cima sen�o retona false*/
	public boolean pessoaMaiorIdade() { /*Exemplo de um m�todo na superclasse*/
		return idade >= 18; 
	}
}
