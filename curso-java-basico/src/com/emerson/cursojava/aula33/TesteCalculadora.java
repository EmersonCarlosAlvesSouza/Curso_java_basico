package com.emerson.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		
		MinhaCalculadora calc = new MinhaCalculadora();
		System.out.println(calc.soma(2, 3));
		System.out.println(calc.soma(2.5, 3.5));
		System.out.println(calc.soma(4, 5, 7));
		
		
	}

}
