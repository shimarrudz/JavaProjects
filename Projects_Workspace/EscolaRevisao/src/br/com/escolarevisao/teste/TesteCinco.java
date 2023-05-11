package br.com.escolarevisao.teste;

import br.com.escolarevisao.beans.Pessoa;

public class TesteCinco {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoaUm;
		pessoaUm = new Pessoa();
		
		pessoaUm.setNome("Victor Shimada");
		
		//Substring com Begin
		System.out.println("O nome da primeira pessoa é " + pessoaUm.getNome().substring(5));
		
		//Substring com Begin e End
		System.out.println("O nome da primeira pessoa é " + pessoaUm.getNome().substring(0, 3));
		
		System.out.println("O nome da primeira pessoa é " + pessoaUm.getNome().subSequence(0, 3));
}
	
}
