package com.emerson.cursojava.aula31;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;



	public void exibirAutonomia() {
		System.out.println("(FUNÇÃO EXIBIR AUTONOMIA)A autonomia do carro é: " + capCombustivel * consumoCombustivel);
	}

	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
		
	}

	public double calcularCombustivel(double km) {
		return this.divideKMPorConsumoCombustivel(km);
	}
}
