package rogon.javacompleto.trowable.exceptions.checked;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsTest {
	public static void main(String[] args) {
		try {
			criarArquivo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void criarArquivo() throws IOException {
		
		File file = new File("texte.txt");		
		file.createNewFile();
		System.out.println("Criado");
		
	}
	
	public static void criarArquivo2() throws IOException{
		
		try {
			criarArquivo();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
