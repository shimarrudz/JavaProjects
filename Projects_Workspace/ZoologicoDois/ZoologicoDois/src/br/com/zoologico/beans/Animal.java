package br.com.zoologico.beans;

public class Animal {
	private String nome;
	private int idade;
	
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final int getIdade() {
		return idade;
	}
	public final void setIdade(int idade) {
		this.idade = idade;
	}
}
