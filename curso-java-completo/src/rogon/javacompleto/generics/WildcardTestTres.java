package rogon.javacompleto.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardTestTres {	
	public static void main(String[] args) {		
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
		
		//Isso pode
		printConsulta(cachorros);
		printConsulta(gatos);
		
		List<Animal> animals = new ArrayList<>();
		
		printConsultaAnimal(animals);
		printConsultaAnimal(cachorros);
		
	}
	
	//Isso é Wildcard ?
	//Aceitaremos qualquer tipo de lista que seja filha de Animal
	//Nesse caso não poderemos adicionar na lista, pois o Java não sabe qual
	//O tipo exato de lista
	private static void printConsulta(List<? extends Animal> animals) {		
		for(Animal animal : animals) {			
			animal.consulta();			
		}	
		//Isso não pode
		//animals.add(new Cachorro());
		//animals.add(new Gato());
	}
	
	//Para adicionar precisamos fazer
	//Posso receber qualquer uma que seja anima ou pai
	//Nesse casso podemos receber Cachorro => Animal => Object
	private static void printConsultaAnimal(List<? super Cachorro> animals) {
		//Agora teremos que pegar a classe mais generica para esse for.
		for(Object o : animals) {
			
		}
	}
	
	//Neste casso o polimorfismo nos garante que sempre teremos um animal na lista
	private static void printConsultaAnimal2(List<? super Animal> animals) {
		
		//podemos fazer
		animals.add(new Cachorro());
		animals.add(new Gato());
	}

}
