package rogon.javacompleto.generics;

import java.util.Iterator;

abstract class Animal {
	
	public abstract void consulta();
}

class Cachorro extends Animal{

	@Override
	public void consulta() {
		
		System.out.println("Consulta Cachorro");
		
	}
	
}

class Gato extends Animal{

	@Override
	public void consulta() {
		
		System.out.println("Consulta Gato");
		
	}
	
}

public class WildcardTestUm {
	
	public static void main(String[] args) {
		
		Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
		Gato[] gatos = {new Gato(), new Gato()};
		
		printConsulta(cachorros);
		printConsulta(gatos);
		
	}
	
	private static void printConsulta(Animal[] animals) {
		
		for(Animal animal : animals) {
			
			animal.consulta();
			
		}
		
		//teremos um erro quando passarmos o array de cachorros. Só
		//funciona se o nosso array for realmente de animal
		//animals[1] = new Gato();
	}

}
