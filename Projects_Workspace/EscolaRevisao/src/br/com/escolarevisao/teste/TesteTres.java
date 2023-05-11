package br.com.escolarevisao.teste;

import br.com.escolarevisao.beans.Pessoa;

public class TesteTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pessoa pessoaUm;
		pessoaUm = new Pessoa();
		
		pessoaUm.setNome("Victor Shimada");
		
		System.out.println(pessoaUm.getNome());
		
		Pessoa pessoaDois;
		pessoaDois = new Pessoa();
		
		pessoaDois.setNome("victor Shimada");
		
		System.out.println(pessoaDois.getNome());
		
		


		//EqualIgnoreCase: ignora as letras maiúsculas e minúsculas
		if(pessoaUm.getNome().equalsIgnoreCase(pessoaDois.getNome())) {
			System.out.println("Os nomes são iguais");
		}
		else {
			System.out.println("Os nomes não são iguais");
		}
	}

}
