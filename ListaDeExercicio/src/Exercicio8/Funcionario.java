package Exercicio8;

public class Funcionario {
	
	public String nome;
	public String cargo;
	public double salario;
	
	public void ImprimirInformacoes() {
		System.out.println("Nome do funcionario: " + this.nome);
		System.out.println("Cargo do funcionario: " + this.cargo);
		System.out.println("Salario do funcionario: " + this.salario);
	}

}
