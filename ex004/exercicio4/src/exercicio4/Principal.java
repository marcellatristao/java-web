package exercicio4;
import javax.swing.JOptionPane;

public class Principal {

	public static void main (String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String cor = JOptionPane.showInputDialog("Cor: ");
		String valor = JOptionPane.showInputDialog("Valor: ");
	
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setCor(cor);
		veiculo.setValor(Double.parseDouble(valor));
		
		
		System.out.println(veiculo.toString());
	}
	
}
