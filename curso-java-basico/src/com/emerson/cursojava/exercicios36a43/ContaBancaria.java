package com.emerson.cursojava.exercicios36a43;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double num) {
		if(this.saldo <= 0) {
			System.out.println("Saldo negativo!");
		}else {
			saldo -= num;
			System.out.println("Saque de: " + num);
			System.out.println("Saldo disponivel: " + this.saldo);
			
		}
	}

	public void depositar(double num) {
		this.saldo += num;
		System.out.println("Depositado: " + num);
		System.out.println("Saldo disponivel: " + this.saldo);
	}

	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
}
