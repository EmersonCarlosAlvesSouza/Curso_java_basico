package com.emerson.cursojava.exercicio36;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		Curso curso = new Curso();
		System.out.println("Entre com o nome do curso: ");
		curso.setNome(scan.nextLine());
		System.out.println("Entre com o hórario do curso: ");
		curso.setHorario(scan.nextLine());
		
		
		
		System.out.println("Entre com o nome do professor: ");
		Professor professor = new Professor();
		professor.setNome(scan.nextLine());
		
		System.out.println("Entre com o email do professor: ");
		professor.setEmail(scan.nextLine());
		
		System.out.println("Entre com o departamento do professor: ");
		professor.setDepartamento(scan.nextLine());
		
		
		curso.setProfessor(professor);
		
		//teste de saida
		
		/*System.out.println("Nome do curso: " + curso.getNome());
		System.out.println("Horario do curso: " + curso.getHorario());
		
		if(curso != null && professor != null) {
			System.out.println("Nome do professor: "+ curso.getProfessor().getNome());
			System.out.println("Email do professor: "+ curso.getProfessor().getEmail());
			System.out.println("Departamento do professor: "+ curso.getProfessor().getDepartamento());
		}*/
		
		
		
		
		
		Aluno[] aluno = new Aluno[2];
		
		System.out.println("\n\n=== Informações Aluno ===");
		for(int i=0; i < aluno.length; i++) {
			
			scan.nextLine();
			
			aluno[i] = new Aluno();
			
			System.out.println("Entre com o nome do aluno: ");
			String nome = scan.nextLine();
			System.out.println("Entre com a matricula do aluno: ");
			String matricula = scan.nextLine();
			
			//capturando as notas
			double[] notas = new double[4];
			for(int j=0; j < 4; j++) {
				System.out.println("Digite a nota do aluno "+ (j+1)+" : ");
				notas[j] = scan.nextDouble();
			}

			aluno[i].setNome(nome);
			aluno[i].setMatricula(matricula);
			aluno[i].setNotas(notas);
			
		}
		System.out.println("\n\n");
		
		curso.setAlunos(aluno);
		
		System.out.println(curso.obterInfo());
		
		
		
		
		scan.close();
	}

}
