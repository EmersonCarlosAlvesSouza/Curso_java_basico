package com.emerson.cursojava.exercicios44a46;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

	private int lado;
	
	public double calcularArea() {
		
		return 6 * (lado*lado);
	}

	
	public double calcularVolume() {
		
		return Math.pow(lado, 3);
	}


	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}


}
