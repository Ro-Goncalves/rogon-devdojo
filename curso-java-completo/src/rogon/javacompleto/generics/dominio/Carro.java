package rogon.javacompleto.generics.dominio;

public class Carro {
	
	private String nome;
	
	public Carro(String nome) {
		this.nome = nome;		
	}
	
	@Override
	public String toString() {		
		return "Carro{" +"nome'"+ this.nome + "\'" + "}";
	}
}
