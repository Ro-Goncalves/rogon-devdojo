package rogon.javacompleto.trowable.exceptions.checked;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsTest {
	public static void main(String[] args) {
//		try {
//			criarArquivo();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		abrirArquivo();
	}
	
	//Lança a exceção, quem chamar o método que deve tratá=lo
	public static void criarArquivo() throws IOException {
		
		File file = new File("texte.txt");		
		file.createNewFile();
		System.out.println("Criado");
		
	}
	
	//finally sempre será executado, ele executa mesmo quando existe retorno
	public static String abrirArquivo() {
		
		try {
			System.out.println("Abrindo um arquivos");
			System.out.println("Executando a leitura do arquivos");
			//throw new Exception();
			System.out.println("Escrevendo no arquivo");	
			return "Valor";
		} catch(Exception e) {
			System.out.println("Dentro do catch");
			e.printStackTrace();			
		} finally {
			System.out.println("Fechado o arquivo");
		}
		
		return null;
		
		
	}
	
	//Podemo tratar a exceção e lança-la novamente, ou outra
	public static void criarArquivo2() throws IOException{
		
		try {
			criarArquivo();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
