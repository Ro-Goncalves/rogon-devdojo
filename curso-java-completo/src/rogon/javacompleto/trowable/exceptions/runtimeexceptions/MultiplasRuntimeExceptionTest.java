package rogon.javacompleto.trowable.exceptions.runtimeexceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import javax.management.modelmbean.XMLParseException;

public class MultiplasRuntimeExceptionTest {

	public static void main(String[] args) {
		try {
			throw new ArrayIndexOutOfBoundsException();
		//Um catch para cada exceção.
		//Não pode fazer - O tipo mais genérico deve estar por último
		//}catch(RuntimeException e) {
			//System.out.println("Dentro de ArrayIndexOutOfBoundsException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro de ArrayIndexOutOfBoundsException");
		}catch(IllegalArgumentException e) {
			System.out.println("Dentro de IllegalArgumentException");
		}catch(ArithmeticException e) {
			System.out.println("Dentro de ArithmeticException");
		}
		
		//Nossa classe pede dois tratamentos
		try {
			talvezLanceException();
		//Não pode conter classes na mesma linha de herança IOException com FileNotFoundException
		//} catch (SQLException |FileNotFoundException e) {
			
		//
		} catch (Exception e) {
			//não pode
			//e = new SQLException();
			e.printStackTrace();
		} 
	}
	
	private static void talvezLanceException() throws SQLException, FileNotFoundException, XMLParseException{}

}
