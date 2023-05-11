package br.com.fiapdez.beans;

public class Pessoa {

	private String nome;
	private int idade;
	private String endereco;
	
	//Construtor vazio
	public Pessoa (){	
	}
	
	//Construtor que recebe apenas um atributo
	public Pessoa (int recebeIdade) {
		setIdade(recebeIdade);
	}
	
	//Construtor que recebe dois parâmetros: nome e idade
	public Pessoa(String recebeNome, int recebeIdade) {
		setNome(recebeNome);
		setIdade(recebeIdade);
	}
	
	//Construtor que recebe dois parâmetros: idade e endereco
	public Pessoa(int recebeIdade, String recebeEndereco) {
		setIdade(recebeIdade);
		setEndereco(recebeEndereco);
	}
	
	//Construtor cheio pois é um que recebe os três atributos da classe
	public Pessoa (String recebeNome, int recebeIdade, String recebeEndereco){
		setNome(recebeNome);
		setIdade(recebeIdade);
		setEndereco(recebeEndereco);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
