package br.com.testemanipulacaostring.beans;

public class TesteCincoStrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Victor Shimada ";
		String nomeDois = "Beatriz Arantes";
		
		System.out.println(nome);
		System.out.println(nomeDois);
		
		//Remove os espaços indevidos
		System.out.println(nome.trim());
		System.out.println(nome);
		System.out.println(nome.split(nomeDois));
	}

}
