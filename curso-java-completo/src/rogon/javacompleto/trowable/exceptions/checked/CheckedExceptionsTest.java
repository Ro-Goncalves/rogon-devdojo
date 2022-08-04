package rogon.javacompleto.trowable.exceptions.checked;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsTest {
	public static void main(String[] args) {
		
	}
	
	public static void criarArquivo() {
		File file = new File("texte.txt");
		//lança uma exceção do tipo checked
		try {
			file.createNewFile();
			System.out.println("Criado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
