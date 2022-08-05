package rogon.javacompleto.trowable.exceptions.checked;

import rogon.javacompleto.trowable.exceptions.checked.classes.Funcionario;
import rogon.javacompleto.trowable.exceptions.checked.classes.Pessoa;

public class SobrescritaComExceptionsTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Pessoa pessoa = new Pessoa();
		
		funcionario.salvar();
		
		pessoa.salvar();
	}

}
