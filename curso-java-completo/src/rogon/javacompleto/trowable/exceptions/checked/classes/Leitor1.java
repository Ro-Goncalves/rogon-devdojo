package rogon.javacompleto.trowable.exceptions.checked.classes;

public class Leitor1 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Fechando 1");		
	}

}
