package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {	
		
		// new Aluno() é uma instancia/ criação de um objeto!!
		
		//aluno1 é uma referência para o aluno
		
		Aluno aluno1 = new Aluno(); /*João*/
		
		aluno1.nome = "João";
		aluno1.idade =16;
		aluno1.dataNascimento="21-02-2001";
		
		System.out.println("NOME: " + aluno1.nome + "\nIDADE: " + aluno1.idade +
				"\nDATA NASCIMENTO: " + aluno1.dataNascimento);
		
		Aluno aluno2 = new Aluno(); /*Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 40);
	}
}
