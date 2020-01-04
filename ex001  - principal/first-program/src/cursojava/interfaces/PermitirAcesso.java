package cursojava.interfaces;

/*Essa interface ser� o nosso contrato de autentica��o*/
public interface PermitirAcesso {
	
	/*Na interface apenas ficam as declara��es dos m�todos*/
	public boolean autenticar(String login, String senha);

	public boolean autenticar();
}
