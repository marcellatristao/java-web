package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		//    L  C		
		notas[0][0] = 80; //primeira linha e primeira coluna
		notas[0][1] = 90; //primeira linha e segunda coluna
		notas[0][2] = 100;
		
		notas[1][0] = 50;
		notas[1][1] = 60;
		notas[1][2] = 70;
		
		for(int poslinha = 0; poslinha < notas.length; poslinha++) { /*percorrendo as linhas*/
			/*Para cada linha percorrer as colunas array*/
			System.out.println("====================");
			for(int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) { /*percorrendo as colunas*/
				System.out.println("Valor da matriz: " +notas[poslinha][poscoluna]);
			}
		}
	}
	
}
