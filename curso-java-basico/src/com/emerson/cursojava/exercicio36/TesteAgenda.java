package com.emerson.cursojava.exercicio36;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome da Agenda: ");
	    Agenda agenda = new Agenda();
	    agenda.setNome(scan.nextLine());
	    
	    
	   
	    Contato[] contato = new Contato[3];
	    
	    for(int i=0; i<3;i++) {
	    	Contato c = new Contato();
	    	System.out.println("Entre com as informações do contato\n ");
	    	
	    	
	    	
	    	System.out.println("Nome:");
	    	String nome = scan.nextLine();
	    	c.setNome(nome);
	    	
	    	
	    	System.out.println("Telefone: ");
	    	String telefone = scan.nextLine();
	    	c.setTelefone(telefone);
	    	
	    	
	    	System.out.println("Email: ");
	    	String email = scan.nextLine();
	    	c.setTelefone(email);
	    	
	    	contato[i] = c;
	    	
	    	
	    }
	    
	    
	    
	    agenda.setContato(contato);
	    
	    
	    if(agenda != null) {
	    	System.out.println(agenda.obterInfo());
	    }
	    
	    scan.close();

	}

}
