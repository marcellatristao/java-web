package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Variável gobal é acessivel a todos e o seu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/*Variavel local pois pertence somente a este método e o valor fica dentro do método*/
		int maiorIdade = 18;
		System.out.println("Valor da variável local = " + maiorIdade);
		System.out.println("Valor da variável global = " + maiorIdadeGlobal);
		metodo2();
	}
	
	public static void metodo2() {
		int mediaAno =50;
		System.out.println("Valor da variável global = " + maiorIdadeGlobal);
		
	}
	
}
