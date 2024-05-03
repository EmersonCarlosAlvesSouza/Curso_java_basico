package com.emerson.cursojava.exercicios36a43;

public class ContaEspecial extends ContaBancaria{

	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// • sobrescreva o método sacar com a nova lógica necessária
	 public void sacar(double num) {
			/*if(this.getSaldo() <= 0) {
				System.out.println("Saldo negativo!");
			}else {
				double aux;
				aux = getSaldo();
				aux -= num;
				setSaldo(aux);
				System.out.println("Saque de: " + num);
				System.out.println("Saldo disponivel: " + this.getSaldo());
				
			}*/
		}
}
