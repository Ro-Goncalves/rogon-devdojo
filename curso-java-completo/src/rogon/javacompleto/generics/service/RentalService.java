package rogon.javacompleto.generics.service;

import java.util.List;

public class RentalService <T> {
	private List<T> objetosdDisponiveis;
	
	public RentalService(List<T> objetosDisponiveis) {
		this.objetosdDisponiveis = objetosDisponiveis;
	}
	
	public T buscarObjetoDisponivel() {
		System.out.println("Buscando Objeto ....");
		T t = objetosdDisponiveis.remove(0);
		System.out.println("Alugando Objeto" + t);
		System.out.println("Objeto para alugar");
		System.out.println(objetosdDisponiveis);
		return t;
	}
	
	public void retornarObjetoAlugado(T t) {
		System.out.println("Devolvendo Objeto");
		objetosdDisponiveis.add(t);
		System.out.println("Objetos disponíveis");
		System.out.println(objetosdDisponiveis);
	}
}
