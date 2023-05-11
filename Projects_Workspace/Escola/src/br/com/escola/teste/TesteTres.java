package br.com.escola.teste;

import br.co.teste.beans.Pessoa;

public class TesteTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Victor Shimada");
		
		System.out.println(pessoa.getNome());
		
		Pessoa pessoaDois = new Pessoa();
		pessoaDois.setNome("victor Shimada");

		System.out.println(pessoaDois.getNome());
		
		if(pessoa.getNome().equalsIgnoreCase(pessoaDois.getNome())) {
			System.out.println("Os nomes são iguais");
		}
		else {
			System.out.println("Os nomes são diferentes");
		}
		
		
	}

}
