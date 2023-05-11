package br.com.testemanipulacaostring.beans;

public class TesteDoisEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nomeUm = "Victor Shimada";
		String nomeDois = "victor Shimada";
		
		
		// Condição com ==
		if (nomeUm == nomeDois) {
			System.out.println("Os nomes são iguais!");
		}
		else {
			System.out.println("Os nomes são diferentes!");
		}
		
		//Condição com equals
		if (nomeUm.equalsIgnoreCase(nomeDois)){
			System.out.println("Os nomes são iguais!");
		}
		else {
			System.out.println("Os nomes são diferentes!");
		}

	}

}
