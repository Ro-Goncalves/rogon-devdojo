package rogon.javacompleto.generics;

import java.util.ArrayList;
import java.util.List;

import rogon.javacompleto.generics.dominio.Barco;
import rogon.javacompleto.generics.dominio.Carro;
import rogon.javacompleto.generics.service.BarcoRentavelService;
import rogon.javacompleto.generics.service.CarroRentavelService;
import rogon.javacompleto.generics.service.RentalService;

public class ClasseGenericaTestDois {

	public static void main(String[] args) {
		List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Barco Um"), new Barco("Barco Dois")));
		List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
		
		RentalService<Carro> retalServiceCarro = new RentalService<>(carrosDisponiveis);
		Carro carro = retalServiceCarro.buscarObjetoDisponivel();		
		System.out.println("Usando Carro");		
		retalServiceCarro.retornarObjetoAlugado(carro);
		
		System.out.println("========================");
		
		RentalService<Barco> retalServiceBarco = new RentalService<>(barcosDisponiveis);
		Barco barco = retalServiceBarco.buscarObjetoDisponivel();		
		System.out.println("Usando Barco");		
		retalServiceBarco.retornarObjetoAlugado(barco);
	}

}
