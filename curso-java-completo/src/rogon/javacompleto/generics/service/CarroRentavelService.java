package rogon.javacompleto.generics.service;

import java.util.ArrayList;
import java.util.List;

import rogon.javacompleto.generics.dominio.Carro;

public class CarroRentavelService {
	private List<Carro> carrosDisponiveis = new ArrayList<>(
			List.of(new Carro("BMW"), new Carro("Fusca"))
	);
	
	public Carro buscarCarroDisponivel() {
		System.out.println("Buscando carro ....");
		Carro carro = carrosDisponiveis.remove(0);
		System.out.println("Alugando carro" + carro);
		System.out.println("Carros para alugar");
		System.out.println(carrosDisponiveis);
		return carro;
	}
	
	public void retornarCarroAlugadO(Carro carro) {
		System.out.println("Devolvendo carro");
		carrosDisponiveis.add(carro);
		System.out.println("Carros disponíveis");
		System.out.println(carrosDisponiveis);
	}
}
