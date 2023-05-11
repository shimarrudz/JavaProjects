package br.com.escola.teste;

import br.co.teste.beans.Pessoa;

public class TesteQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("victor shimada");
		System.out.println(pessoa.getNome());
		
		System.out.println(pessoa.getNome().toUpperCase());
		System.out.println(pessoa.getNome());
	}

}
