package Exercicio7;

public class Livro {
	
	public String titulo;
	public String modelo;
	public int ano;
	
	public void ImprimirInformacoes() {
		System.out.println("titulo do livro: " + this.titulo);
		System.out.println("Modelo do livro: " + this.modelo);
		System.out.println("Ano do livro: " + this.ano);
	}

}
