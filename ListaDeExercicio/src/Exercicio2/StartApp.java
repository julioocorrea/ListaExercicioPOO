package Exercicio2;

public class StartApp {
	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria();
		cb1.titular = "Júlio";
		cb1.saldo = 1500;
		
		cb1.Deposita(55.50);
		cb1.Saque(50);
		
	}
}
