package com.emerson.cursojava.exercicios44a46;

public class Quadrado extends Figura2D implements DimensaoSuperficial{

	private int lado;
	
	public double calcularArea() {
		return lado * lado;
		
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

}
