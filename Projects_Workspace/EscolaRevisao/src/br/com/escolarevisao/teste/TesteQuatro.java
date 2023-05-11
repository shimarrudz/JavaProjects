package br.com.escolarevisao.teste;

import br.com.escolarevisao.beans.Pessoa;

public class TesteQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoaUm;
		pessoaUm = new Pessoa();
		pessoaUm.setNome("Victor Shimada");
		
		//Printando normalmente
		System.out.println(pessoaUm.getNome());
		//Printando com UPPER CASE
		System.out.println(pessoaUm.getNome().toUpperCase());
		//Printando com LOWER CASE
		System.out.println(pessoaUm.getNome().toLowerCase());
		

	}

}
