package br.com.fiapdez.teste;

import javax.swing.JOptionPane;

import br.com.fiapdez.beans.Pessoa;

public class ProgramaPessoa {

	public static void main(String[] args) {

		//Utilizando o construtor com um dos par�metros
		Pessoa pessoa = new Pessoa("Rafael", 36);
		
		System.out.println("O nome �: " + pessoa.getNome() + "\n");
		
		
		//Segundo objeto utilizando o construtor cheio
		Pessoa pessoaDois = new Pessoa("Karina", 35, "Av. Lins de Vasconcelos");
		
		System.out.println(pessoaDois.getNome() + "\n" + pessoaDois.getIdade() + "\n" + pessoaDois.getEndereco() + "\n");
		
		
		//Criando o terceiro objeto utilizando o construtor vazio
		Pessoa pessoaTres = new Pessoa();
		
		pessoaTres.setNome(JOptionPane.showInputDialog("Digite o nome"));
		pessoaTres.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
		pessoaTres.setEndereco(JOptionPane.showInputDialog("Digite o endere�o"));
		
		System.out.println(pessoaTres.getNome() + "\n" + pessoaTres.getIdade() + "\n" + pessoaTres.getEndereco() + "\n");
	
	
		//Criando o quarto objeto utilizando novamente um construtor vazio
		Pessoa pessoaQuatro = new Pessoa();
	
		pessoaQuatro.setNome(JOptionPane.showInputDialog("Digite o nome"));
		pessoaQuatro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
		pessoaQuatro.setEndereco(JOptionPane.showInputDialog("Digite o endere�o"));
	}
}


