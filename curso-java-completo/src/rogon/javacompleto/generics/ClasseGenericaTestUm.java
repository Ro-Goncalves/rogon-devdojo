package rogon.javacompleto.generics;

import rogon.javacompleto.generics.dominio.Barco;
import rogon.javacompleto.generics.dominio.Carro;
import rogon.javacompleto.generics.service.BarcoRentavelService;
import rogon.javacompleto.generics.service.CarroRentavelService;

public class ClasseGenericaTestUm {

	public static void main(String[] args) {
		CarroRentavelService carroRentavelService = new CarroRentavelService();		
		Carro carro = carroRentavelService.buscarCarroDisponivel();		
		System.out.println("Usando Carro");		
		carroRentavelService.retornarCarroAlugadO(carro);
		
		System.out.println("===============================================");
		
		BarcoRentavelService barcoRentavelService = new BarcoRentavelService();		
		Barco barco = barcoRentavelService.buscarBarcoDisponivel();		
		System.out.println("Usando Barco");		
		barcoRentavelService.retornarBarcoAlugadO(barco);

	}

}
