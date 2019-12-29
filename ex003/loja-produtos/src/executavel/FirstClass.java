package executavel;
import classes.Produto;

public class FirstClass {

	public static void main (String[] args) {
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		
		produto1.setNome("Notebook i5");
		produto1.setPrecoCusto(1550.00);
		produto1.setPrecoVenda(1880.00);
		
		System.out.println("PRODUTO: " +produto1.getNome() + "\nCUSTO: " +produto1.getPrecoCusto() +  "\nVENDA: " +produto1.getPrecoVenda());
		System.out.println("LUCRO: " +produto1.getMargemLucro());
		
	}
	
}
