package br.com.lojademusica.beans;

public class Produto {

	private String nome;
	private int preco;
	private String marca;

	
	
	
	// Construtor vazio
	public Produto() {

	}

	// Construtor com um parametro
	public Produto(String receberNome) {
		setNome(receberNome);
	}

	// Construtor com dois parametros
	public Produto(String receberNome, int receberPreco) {
		setNome(receberNome);
		setPreco(receberPreco);
	}

	// Construtor com dois parametros diferentes
	public Produto(int receberPreco, String receberMarca) {
		setPreco(receberPreco);
		setMarca(receberMarca);
	}

	// Construtor cheio
	public Produto(String receberNome, int receberPreco, String receberMarca) {
		setNome(receberNome);
		setPreco(receberPreco);
		setMarca(receberMarca);
	}
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
