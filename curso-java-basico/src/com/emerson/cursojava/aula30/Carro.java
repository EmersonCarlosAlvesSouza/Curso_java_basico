package com.emerson.cursojava.aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro() {}
	

	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros");
	}


	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10);
		System.out.println("Chamando o construtor com 2 parâmetros");
	}


	void exibirAutonomia() {
		System.out.println("(FUNÇÃO EXIBIR AUTONOMIA)A autonomia do carro é: " + capCombustivel * consumoCombustivel);
	}

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		return km / consumoCombustivel;
	}
}
