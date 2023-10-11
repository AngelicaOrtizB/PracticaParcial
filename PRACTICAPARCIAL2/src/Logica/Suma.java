package Logica;

public class Suma extends operacionMatematica {

	public Suma(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return this.num1 + this.num2;
	}

}
