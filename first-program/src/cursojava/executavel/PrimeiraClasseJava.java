package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Vari�vel gobal � acessivel a todos e o seu valor � compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		
		/*Variavel local pois pertence somente a este m�todo e o valor fica dentro do m�todo*/
		int maiorIdade = 18;
		System.out.println("Valor da vari�vel local = " + maiorIdade);
		System.out.println("Valor da vari�vel global = " + maiorIdadeGlobal);
		metodo2();
	}
	
	public static void metodo2() {
		int mediaAno =50;
		System.out.println("Valor da vari�vel global = " + maiorIdadeGlobal);
		
	}
	
}
