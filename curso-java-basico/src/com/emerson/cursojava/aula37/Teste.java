package com.emerson.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//como colocarmos o extends para a classe Pessoa podemos acessar/herdar seus atributos e acessar como mostrando abaixo.
		aluno.setNome("Emerson");
		System.out.println(aluno.getNome());
		
		
		professor.setNome("sei la");
		System.out.println(professor.getNome());
		
		//Podemos criar uma instancia chamada super classe assim
		
		Pessoa aluno2 = new Aluno();
		aluno2.setCpf("231321");
		//dessa forma temos acesso apenas aos campos da classe Pessoa mesmo usando o 'new Aluno()'
	}

}
