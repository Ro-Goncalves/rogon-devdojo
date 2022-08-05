package rogon.javacompleto.trowable.exceptions.checked.classes;

import rogon.javacompleto.trowable.exceptions.custom.LoginException;

public class Funcionario extends Pessoa{
	
	//O método sobrescrito pode ou não lançar as exceções
	//Pode lançar somente um
	//Não pode criar uma exceção que não foi criada na mãe. Somente Runtime ou filhas
	//Pode declarar filhas das exceções que foram declaradas.
	
	//Resumo, pode declarar as mesmas ou subclasses das exceções declaradas na mãe
	public void salvar() throws LoginException{
		
	}
}
