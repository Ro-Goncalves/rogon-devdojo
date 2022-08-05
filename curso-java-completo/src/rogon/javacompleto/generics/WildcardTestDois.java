package rogon.javacompleto.generics;

import java.util.List;

public class WildcardTestDois {	
	public static void main(String[] args) {		
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
		
		printConsulta(cachorros);
		
	}
	
	//Type erasure, erro. Java não sabe que cachorro é animal
	//Devemos passar exatamente esse tipo de lista. Isso é Wildcard
	private static void printConsulta(List<Animal> animals) {		
		for(Animal animal : animals) {			
			animal.consulta();			
		}	
		//Isso pode
		animals.add(new Cachorro());
		animals.add(new Gato());
	}

}
