package rogon.javacompleto.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
	public static void main(String[] args) {
		List lista = new ArrayList<>();
		//Até 1.4 o Java aceitava qualquer coisa em uma lista
		lista.add("String");
		lista.add(1L);
		lista.add(12.2);
		
		//No for nossa referência deveria ser Object
		for(Object o : lista) {
			if(o instanceof String) {
				System.out.println(o);
			}
			if (o instanceof Long) {
				System.out.println(o);
			}
		}
		
		//Como atualizar e manter retrocompatibilidade
		//Criar algo em tempo de compilação, generics <>
		List<String> strList = new ArrayList<>();
		strList.add("Oi Mundo");
		strList.add("Oi Eu");
		//não da
		//strList.add(123);
		
		//Para a JVM tudo é List, sem tipo, isso é jamado de type erasure
		
		
		
	}
	
	//outro exemplo, em nosso métodos podemos utilizar o generics para garantir o tipo de dados 
	//que estamos recebendo
	private static void add(List<String> lista, String string) {
		lista.add(string);
	}
	
	//Nesse caso, quem garante que nossa lista será de string
	private static void addDois(List lista, String string) {
		lista.add(string);
	}
}
