package com.emerson.cursojava.exercicios28a33;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada("Branca", "Sei la", 30, "Branca", "florecente" );
		
		/*lamp.setCor("Branca");
		lamp.setModelo("Sei la");
		lamp.setPotencia(30);
		lamp.setTensao("244hz");
		lamp.setTipoLuz("Branca");*/
		
		System.out.println(lamp.getCor() +" " + lamp.getTensao());
		
		
	}

}
