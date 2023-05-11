package br.com.escola.teste;

import br.co.teste.beans.Pessoa;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Victor Shimada Serete");
		
		System.out.println("O nome da pessoa é " + pessoa.getNome());
		
		Pessoa PessoaDois;
		PessoaDois = new Pessoa(); 
		PessoaDois.setNome("Rafa Ronqui");
		
		System.out.println("O nome da pessoa dois é " + PessoaDois.getNome());
		
		int idade = 22;
		System.out.println(idade);
		
		//Abaixo estamos descobrindo o valor do Atributo nome
		int tamanho = pessoa.getNome().length();
		System.out.println(tamanho);
		
		
		
	}

}
