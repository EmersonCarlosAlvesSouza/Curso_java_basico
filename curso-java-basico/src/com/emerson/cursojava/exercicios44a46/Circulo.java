package com.emerson.cursojava.exercicios44a46;

public class Circulo extends Figura2D implements DimensaoSuperficial{

	private double raio;
	
	public double calcularArea() {
		return (raio * raio) * Math.PI;
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
