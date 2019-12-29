package exercicio4;

public class Veiculo {

	/*Adicionar os atributos do veículo*/
	private String marca;
	private String modelo;
	private String cor;
	private double valor;
	
	/*Construtor*/
	public Veiculo() {
	}

	/*getters and setters*/
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
	return 
			"MARCA: " + marca +
			"\nMODELO: " + modelo +
			"\nCOR: " + cor +
			"\nVALOR: " + valor;
	}
	
	/*toString*/
	
	
}
