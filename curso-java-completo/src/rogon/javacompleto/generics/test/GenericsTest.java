package rogon.javacompleto.generics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
	public static void main(String[] args) {
		List lista = new ArrayList<>();
		lista.add("String");
		lista.add(1L);
		lista.add(12.2);
		
		System.out.println(lista.toString());
	}
}
