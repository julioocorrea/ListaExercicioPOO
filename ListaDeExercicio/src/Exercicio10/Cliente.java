package Exercicio10;

public class Cliente {
	
	public String nome;
	public String endereco;
	public int telefone;
	
	public void ImprimirInformacoes() {
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Endereço do Cliente: " + this.endereco);
		System.out.println("Telefone do Cliente: " + this.telefone);
	}
	
}
