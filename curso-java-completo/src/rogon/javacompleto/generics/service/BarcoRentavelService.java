package rogon.javacompleto.generics.service;

import java.util.ArrayList;
import java.util.List;

import rogon.javacompleto.generics.dominio.Barco;

public class BarcoRentavelService {
	private List<Barco> barcosDisponiveis = new ArrayList<>(
			List.of(new Barco("Barco Um"), new Barco("Barco Dois"))
	);
	
	public Barco buscarBarcoDisponivel() {
		System.out.println("Buscando barco ....");
		Barco barco = barcosDisponiveis.remove(0);
		System.out.println("Alugando barco" + barco);
		System.out.println("Barcos para alugar");
		System.out.println(barcosDisponiveis);
		return barco;
	}
	
	public void retornarBarcoAlugadO(Barco barco) {
		System.out.println("Devolvendo barco");
		barcosDisponiveis.add(barco);
		System.out.println("Barcos disponíveis");
		System.out.println(barcosDisponiveis);
	}
}
