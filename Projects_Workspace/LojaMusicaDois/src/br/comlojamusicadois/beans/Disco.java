package br.comlojamusicadois.beans;

public class Disco extends Produto{

	private String nomeArtista;
	private String album;
	private int quantMusicas;
	private int duracaoMusicas;

	// Construtor vazio
	public Disco() {

	}


	public Disco(String receberNomeArtista, String receberAlbum, int receberQuantMusicas, int receberDuracaoMusicas) {
		super(receberCodProduto, receberPreco);
		setNomeArtista(receberNomeArtista);
		setAlbum(receberAlbum);
		setQuantMusicas(receberQuantMusicas);
		setDuracaoMusicas(receberDuracaoMusicas);

		
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getQuantMusicas() {
		return quantMusicas;
	}

	public void setQuantMusicas(int quantMusicas) {
		this.quantMusicas = quantMusicas;
	}

	public int getDuracaoMusicas() {
		return duracaoMusicas;
	}

	public void setDuracaoMusicas(int duracaoMusicas) {
		this.duracaoMusicas = duracaoMusicas;
	}

}