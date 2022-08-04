package rogon.javacompleto.trowable.exceptions.checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import rogon.javacompleto.trowable.exceptions.checked.classes.Leitor1;
import rogon.javacompleto.trowable.exceptions.checked.classes.Leitor2;

public class TryWithResources {
	public static void main(String[] args) {
		try {
			abrirArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivosOld() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("text.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if (reader != null) {
					reader.close();
				}				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
	//É possível lançar a exceção, mas recomentado tratá-la.
	public static void lerArquivos() throws IOException {
		
		//A classe que vai dentro do try precisa implementar Closable		
		try (Reader reader = new BufferedReader(new FileReader("text.txt"))){
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Pode conter mais de uma abertura
	public static void abrirArquivos() throws Exception {
		try (Leitor1 l1 = new Leitor1(); 
				Leitor2 l2 = new Leitor2()){
			
		}
	}
}
