package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		String texto = "marcella, curso Java, 80, 90, 100";
		
		String[] valoresArray = texto.split(",");
		
		System.out.println("Nome: " +valoresArray[0]);
		System.out.println("Curso: " +valoresArray[1]);
		System.out.println("Nota 1: " +valoresArray[2]);
		System.out.println("Nota 2: " +valoresArray[3]);
		System.out.println("Nota 4: " +valoresArray[4]);
		
		/*Convertendo um array em uma lista*/	
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valor : list) {
			System.out.println(valor);
		}
		/*Converter uma lista para um array*/
		String[] conversaoArray = list.toArray(new String[6]);
	}
	
}
