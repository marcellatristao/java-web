package cursojava.interfaces;

/*Essa interface será o nosso contrato de autenticação*/
public interface PermitirAcesso {
	
	/*Na interface apenas ficam as declarações dos métodos*/
	public boolean autenticar(String login, String senha);

	public boolean autenticar();
}
