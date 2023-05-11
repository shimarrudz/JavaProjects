package br.com.escolarevisao.teste;

import br.com.escolarevisao.beans.Pessoa;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Instanciando um segundo objeto pessoa e setando as variáveis
		Pessoa pessoaUm = new Pessoa();
		pessoaUm.setNome("Victor");
		pessoaUm.setSobrenome("Shimada Serete");
		pessoaUm.setIdade(19);

		System.out.println("O nome da primeira pessoa: " + pessoaUm.getNome() + " " + pessoaUm.getSobrenome() +
							"\nA idade da primeira pessoa: " + pessoaUm.getIdade());
		
		
		//Instanciando um segundo objeto
		Pessoa pessoaDois;
		pessoaDois = new Pessoa();
		pessoaDois.setNome("Beatriz");
		pessoaDois.setSobrenome("de Almeida Arantes");
		pessoaDois.setIdade(20);
		
		System.out.println("\nO nome da segunda pessoa: " + pessoaDois.getNome() + " " + pessoaDois.getSobrenome() +
							"\nA idade da segunda pessoa: " + pessoaDois.getIdade());
		
		
		//Instanciando um terceiro objeto
		Pessoa pessoaTres;
		pessoaTres = new Pessoa();
		pessoaTres.setNome("Mie");
		pessoaTres.setSobrenome("Shimada");
		pessoaTres.setIdade(49);
		
		System.out.println("\nO nome da terceira pessoa é " + pessoaTres.getNome() + " " + pessoaTres.getSobrenome() + 
							"\nA idade da terceira pessoa: " + pessoaTres.getIdade());

	}

}
