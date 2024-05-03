package com.emerson.cursojava.exercicios36a43;

public class Peixe extends Animal{
    
	private String caracteristicas;

	Peixe(){
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cizenta");
		this.caracteristicas = "Barbatanas e Caudas";
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	
	public String toString() {
		String s;
		s = super.toString();
		s += "\nCaracteristicas = "  + caracteristicas;
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
