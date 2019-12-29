package executavel;

import classes.carro;

public class ClasseCarro {

	public static void main(String[] args) {
	
		carro carro1 = new carro();
		
		/*Atribuição dos valores*/
		carro1.setPlaca("AUG-1815");
		carro1.setCor("Preto");
		carro1.setValor("15000");
		
		/*Imprimindo os valores no console*/
		System.out.println("PLACA: " +carro1.getPlaca() +"\nCOR: " +carro1.getCor() + "\nVALOR: " +carro1.getValor());
	}
}
