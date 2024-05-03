package com.emerson.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	void exibirAutonomia() {
		System.out.println("(FUNÇÃO EXIBIR AUTONOMIA)A autonomia do carro é: " + capCombustivel * consumoCombustivel);
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
}
