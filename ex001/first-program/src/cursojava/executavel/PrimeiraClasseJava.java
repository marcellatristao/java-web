package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {	
		
		// new Aluno() é uma instancia/ criação de um objeto!!
		
		//aluno1 é uma referência para o aluno
	
		Aluno aluno1 = new Aluno(); /*Objeto aluno 1*/
		Aluno aluno2 = new Aluno(); /*Objeto aluno 2*/
	
		aluno1.setNome("Marcella Canedo Tristão");
		aluno1.setIdade(19);
		aluno1.setDataNascimento("02/05/2000");
		aluno1.setRegistroGeral("0000000");
		aluno1.setNumeroCpf("000-000-000-00");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("João");
		aluno1.setDataMatricula("29/12/2019");
		aluno1.setNomeEscola("Auxiliadora");
		aluno1.setSerieMatriculada("5ª");
		aluno1.setNota1(44);
		aluno1.setNota2(73);
		aluno1.setNota3(93.9);
		aluno1.setNota4(56);
		
		System.out.println("NOME COMPLETO: " +aluno1.getNome() + "\nIDADE: " +aluno1.getIdade() + 
				"\nDATA NASCIMENTO: " +aluno1.getDataNascimento() + "\nREGISTRO GERAL: " +aluno1.getRegistroGeral() 
				+ "\nNUMERO CPF: " +aluno1.getNumeroCpf() + "\nNOME MAE: " +aluno1.getNomeMae() + "\nNOME PAI: " +aluno1.getNomePai() +
				"\nDATA MATRICULA: " +aluno1.getDataMatricula() + "\nNOME ESCOLA" + "\nSERIE MATRICULADA: " +aluno1.getSerieMatriculada());	
		
		System.out.println("\nMEDIA DA NOTA: " +aluno1.getMediaNota()); //CHAMADA DE MÉTODO
		
		if(aluno1.getaprovado() == false) {
			System.out.println("Aluno reprovado!");	
		}else {
			System.out.println("Aluno aprovado!");
		}
		
		System.out.println("\n\n------------------------------\n");
		
		/*
		 * aluno2.setNome("Pedro da Silva"); aluno2.setIdade(16);
		 * aluno2.setDataNascimento("05/02/2000"); aluno2.setRegistroGeral("0000000");
		 * aluno2.setNumeroCpf("000-000-000-00"); aluno2.setNomeMae("Maria");
		 * aluno2.setNomePai("João"); aluno2.setDataMatricula("10/02/2019");
		 * aluno2.setNomeEscola("Auxiliadora"); aluno2.setSerieMatriculada("6ª");
		 * 
		 * System.out.println("NOME COMPLETO: " +aluno2.getNome() + "\nIDADE: "
		 * +aluno2.getIdade() + "\nDATA NASCIMENTO: " +aluno2.getDataNascimento() +
		 * "\nREGISTRO GERAL: " +aluno2.getRegistroGeral() + "\nNUMERO CPF: "
		 * +aluno2.getNumeroCpf() + "\nNOME MAE: " +aluno2.getNomeMae() + "\nNOME PAI: "
		 * +aluno2.getNomePai() + "\nDATA MATRICULA: " +aluno2.getDataMatricula() +
		 * "\nNOME ESCOLA" + "\nSERIE MATRICULADA: " +aluno2.getSerieMatriculada());
		 */	
		
	}
}
