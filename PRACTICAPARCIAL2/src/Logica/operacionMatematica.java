package Logica;

public abstract class operacionMatematica {
protected double num1;
protected double num2;
public operacionMatematica(double num1, double num2) {
	this.num1 = num1;
	this.num2 = num2;
}
public abstract double calcular();

}
