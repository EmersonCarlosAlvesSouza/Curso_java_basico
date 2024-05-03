package com.emerson.cursojava.exercicios25a27;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		aluno.nomeDisciplinas = new String[3]; // Inicialize o array nomeDisciplinas

		aluno.notaDisciplinas = new double[3][3]; // Inicialize o array notaDisciplinas

		System.out.println("Informe seu nome: ");
		aluno.nome = scan.nextLine();

		System.out.println("Informe sua matricula: ");
		aluno.matricula = scan.nextLine();

		System.out.println("Informe seu curso: ");
		aluno.curso = scan.nextLine();

//		pegando o nome das diciplinas

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome da " + (i + 1) + "° diciplina: ");
			aluno.nomeDisciplinas[i] = scan.nextLine();
		}

		// pegando as notas
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite as notas da disciplina " + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < 3; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				aluno.notaDisciplinas[i][j] = scan.nextDouble();
			}

		}

		// mostrando informações inseridas
		System.out.println("\n\nNome: " + aluno.nome);
		System.out.println("Matricula: " + aluno.matricula);
		System.out.println("Curso: " + aluno.curso);

		for (int i = 0; i < 3; i++) {
			System.out.println("Notas da disciplina " + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < 3; j++) {
				System.out.println(aluno.notaDisciplinas[i][j] + " ");
			}
			System.out.println();

		}
		
		//chama a função para ver se foi aprovado
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificaNota(i)) {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado!");
			} else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado!");
			}
		}

		scan.close();

	}

}
