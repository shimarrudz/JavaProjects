package br.com.lojademusica.beans;

public class Disco extends Produto{
	
	
	private String nomeArtista;
	private int quantMusicas;
	
	
	//Construtor vazio
	public Disco() {
		
	}
	
	//Construtor cheio
	public Disco(String receberNome, int receberPreco, String receberMarca,
			String receberNomeArtista, int receberQuantMusicas) {
		super(receberNome, receberPreco, receberMarca);
		setNomeArtista(receberNomeArtista);
		setQuantMusicas(receberQuantMusicas);
	}
	
	

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public int getQuantMusicas() {
		return quantMusicas;
	}

	public void setQuantMusicas(int quantMusicas) {
		this.quantMusicas = quantMusicas;
	}
	
	public String mostrarAtributos() {
		return "O nome do produto é " + getNome() + 
				"\nO preco do produto: " + getPreco() + 
				"\nA marca é da: " + getMarca() +
				"\nArtista do disco: " + getNomeArtista()+ 
				"\nO disco possui " + getQuantMusicas() + " músicas.";
		
				
			
	}

}
