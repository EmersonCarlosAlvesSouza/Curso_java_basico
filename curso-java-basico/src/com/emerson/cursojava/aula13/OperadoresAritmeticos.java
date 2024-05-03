package com.emerson.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Emerson";
		String segundoNome = " Carlos";
		String nomeContatenado = primeiroNome + segundoNome;
		System.out.println("Nome contatenado: " + nomeContatenado);
		
		resultado =  resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++); //vai mostrar primeiro o valor de 'resultado' e depos o incremento
		System.out.println(++resultado); //vai somar primerio e depois mostra o 'resultado'
		
		
	}

}
