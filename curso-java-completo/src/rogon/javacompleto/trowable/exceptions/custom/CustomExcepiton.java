package rogon.javacompleto.trowable.exceptions.custom;

public class CustomExcepiton {
	public static void main(String[] args) {
		try {
			Logar();
		} catch (LoginException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static void Logar() throws LoginException{
		String usuario = "Rodrigo";
		String senha = "123";
		String usuarioDigitado  = "Rodrigo";
		String senhaDigitada = "321";
		
		if (!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada)) {
			throw new LoginException("Deu Ruim");
		}
	}

}

