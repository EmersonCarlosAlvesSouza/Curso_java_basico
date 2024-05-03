package com.emerson.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato cont = new Contato();
		
		//cont.setEndereco("Rua dos alfinetes"); temos q criar uma instacia da classe Endereco
		
		//cont.setTelefone("9 99999-9999"); //precisa criar uma instancia da classe Telefone
		
		//Criando objeto telefone
		
		Telefone telefone = new Telefone();
		telefone.setDdd("61");
		telefone.setNumero("34131224");
		telefone.setTipo("Telefone fixo");
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd("61");
		telefone2.setNumero("11111111111111");
		telefone2.setTipo("Casa");
		
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		
		cont.setTelefones(telefones);
		
		
		
		//Criando objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua dos alfinetes");
		end.setNumero("07");
		end.setComplemento("n-a");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("99999999");
		
		cont.setNome("Distrito D");
		//cont.setTelefone(telefone); //atribuis a instancia telefone a outra instancia cont
		cont.setEndereco(end); 
		//System.out.println(cont.getEndereco());
		//passamos para o set o objeto end que criamos, mas dessa forma 
		//passa apenas o endereço de memoria onde esta e não o que esta nos atributos
		
		
		
		
		System.out.println(cont.getNome());
		//System.out.println(cont.getTelefone());
		
		if(cont != null && cont.getEndereco() != null) {//verifica se o objeto não esta vazio
			System.out.println(cont.getEndereco().getCidade()); //agora mostra a cidade
		}
		
		/*if(cont != null && cont.getTelefone() != null) {//verifica se o objeto não esta vazio
			System.out.println(cont.getTelefone().getDdd());
			System.out.println(cont.getTelefone().getNumero());
			System.out.println(cont.getTelefone().getTipo());
		}*/
		
		if (cont != null && cont.getTelefones() != null) {
		    for (int i = 0; i < telefones.length; i++) {
		        Telefone t = telefones[i];
		        System.out.println(t.getDdd() + " " + t.getNumero());
		    }
		}

		//ou podemos usar o for melhorado (for-each)
		if(cont != null && cont.getTelefones() != null) {
			for(Telefone t : cont.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}

}
