package Exercicio2;

public class ContaBancaria {
	
	public double saldo;
	public String titular;
	
	public void Deposita(double deposito) {
		this.saldo += deposito;
		System.out.println("Saldo atual: " + this.saldo);
	}
	
	public void Saque(double saque) {
		this.saldo -= saque;
		System.out.println("Saldo atual: " + this.saldo);
	}	
}

