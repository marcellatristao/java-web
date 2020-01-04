package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TesteClassesFilhas {

	public static void main(String[] args) {
	
		Aluno aluno = new Aluno();
		aluno.setNome("Maria Aparecia Menezes");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("45787923");
		diretor.setNome("Maria");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administrativo");
		secretario.setNome("Jos�");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " +aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario = " +aluno.salario());
		System.out.println("Diretor = " +diretor.salario());
		System.out.println("Secret�rio = " +secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste (Pessoa pessoa) {
		System.out.println("Essa pessoa = " +pessoa.getNome() + " Salario = " +pessoa.salario());
	}
	
}
