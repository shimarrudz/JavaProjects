package br.com.escola.teste;

import br.co.teste.beans.Pessoa;

public class TesteCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jose Ronqui");
		
		System.out.println("O nome da primeira pessoa é " + pessoa.getNome().substring(0, 3));
		//System.out.println("O nome da primeira pessoa é " + pessoa.getNome().substring(1, 3));

		//System.out.println("O nome da primeira pessoa é " + pessoa.getNome().substring(2, 3));
		
		System.out.println(pessoa.getNome().substring(3));

		System.out.println(pessoa.getNome().substring(2));

		System.out.println(pessoa.getNome().substring(1));
	}

}
