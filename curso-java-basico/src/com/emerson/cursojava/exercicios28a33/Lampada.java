package com.emerson.cursojava.exercicios28a33;

public class Lampada {
	
//	1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
	}
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	
	
	

}
