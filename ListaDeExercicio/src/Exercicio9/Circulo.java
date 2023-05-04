package Exercicio9;

public class Circulo {
	
	public double raio;
	
	public void CalcularAreaDoCirculo() {
		double PI = 3.14;
		
		System.out.println("Area do circulo: " + (PI * (Math.pow(this.raio, 2))));
		
	}

}
