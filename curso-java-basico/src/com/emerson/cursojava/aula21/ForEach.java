package com.emerson.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		System.out.println("Usando o for each");
		for (int nota : notas) {
			System.out.println(nota);
		}

		// exemplo com matriz
		double notasAlunos[][] = new double[3][4];

		notasAlunos[0][0] = 6.5;
		notasAlunos[0][1] = 5.9;
		notasAlunos[0][2] = 8.9;
		notasAlunos[0][3] = 9.4;

		notasAlunos[1][0] = 2.6;
		notasAlunos[1][1] = 6.9;
		notasAlunos[1][2] = 7.2;
		notasAlunos[1][3] = 5;

		notasAlunos[2][0] = 6.6;
		notasAlunos[2][1] = 8.6;
		notasAlunos[2][2] = 9.8;
		notasAlunos[2][3] = 10;
		
		for(double[] notasAluno : notasAlunos) {
			for(double nota : notasAluno) {
				System.out.println(nota + " ");
			}
		}
	}

}
