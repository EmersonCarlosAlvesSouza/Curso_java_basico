package com.emerson.cursojava.aula71;

public class MinhaThreadSoma  implements Runnable{

	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
	}
	
	@Override
	public void run() {

		System.out.println(this.nome + " iniciada");
		int soma = calc.somaArray(this.nums);
		System.out.println(this.nome + " terminada");
	}
	
}
