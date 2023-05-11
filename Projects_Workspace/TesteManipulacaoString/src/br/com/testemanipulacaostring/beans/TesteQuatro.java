package br.com.testemanipulacaostring.beans;

public class TesteQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Victor Shimada Serete";
		int tamanhoNome = nome.length();
		
		System.out.println(nome.substring(8, tamanhoNome));
		
		System.out.println(nome.substring(0, 8));
		
		System.out.println(nome.substring(5, 15));
		
		String substringSobrenome = nome.substring(7, tamanhoNome);
		
		String substringSobrenomeLowerCase = substringSobrenome.toLowerCase();
		
		System.out.println(substringSobrenomeLowerCase);
		
		
		
		

		
	}

}
