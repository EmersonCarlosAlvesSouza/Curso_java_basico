package com.emerson.cursojava.exercicios56;

public class Calculadora {
	enum Operacao{
		
		SOMAR("+") {
			@Override
			public double executarOperacao(double x, double y) {
				return  x + y;
			}
		}, SUBTRAIR("-") {
			@Override
			public double executarOperacao(double x, double y) {
				
				return x - y;
			}
		}, MULTIPLICAR("*") {
			@Override
			public double executarOperacao(double x, double y) {
				
				return x * y;
			}
		}, DIVIDIR("/") {
			@Override
			public double executarOperacao(double x, double y) {
				
				return x / y;
			}
		};
		
		private String simbolo;
		
		private Operacao(String simbolo) {
			this.simbolo = simbolo;
		}
		
		public String toString() {
			return this.simbolo;
		}
		public abstract double executarOperacao(double x, double y);
	}
	
	

	
	public static void main(String[] args) {
		double x = 2.0;
		double y = 3.0;
		
		for(Operacao op : Operacao.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
	}
	
	

}
