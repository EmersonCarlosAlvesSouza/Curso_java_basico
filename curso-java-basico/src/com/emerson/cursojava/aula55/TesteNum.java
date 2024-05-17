package com.emerson.cursojava.aula55;

import com.emerson.cursojava.aula54.DiaSemana;

public class TesteNum {

	public static void main(String[] args) {
		DiaSemana[] dias = DiaSemana.values();
		for(int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		System.out.println();
		for(DiaSemana dia: DiaSemana.values()) {
			System.out.println(dia);
		}

	}

}
