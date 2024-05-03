package com.emerson.cursojava.exercicio36;

public class Agenda {

	private Contato contato[];
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContato() {
		return contato;
	}

	public void setContato(Contato[] contato) {
		this.contato = contato;
	}

	public String obterInfo() {
		String info = "Nome = " + nome + "\n";
		if (contato != null) {
			for (Contato c : contato) {
				info += c.obterInfo() + "\n";
			}
		}
	return info;
	}

}
