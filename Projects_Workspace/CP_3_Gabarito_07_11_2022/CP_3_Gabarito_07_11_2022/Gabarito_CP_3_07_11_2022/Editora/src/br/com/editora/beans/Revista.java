package br.com.editora.beans;

public class Revista {
	
	private String nome;
	private String tipoCapa;
	private int totalPagina;
	private double larguraCapa;
	private double alturaCapa;
	
	public Revista () {
		
	}
	
	public Revista(String receberNome, String receberTipoCapa, int receberTotalPagina, double receberLarguraCapa, double receberAlturaCapa) {
		setNome(receberNome);
		setTipoCapa(receberTipoCapa);
		setTotalPagina(receberTotalPagina);
		setLarguraCapa(receberLarguraCapa);
		setAlturaCapa(receberAlturaCapa);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoCapa() {
		return tipoCapa;
	}
	public void setTipoCapa(String tipoCapa) {
		this.tipoCapa = tipoCapa;
	}
	public int getTotalPagina() {
		return totalPagina;
	}
	public void setTotalPagina(int totalPagina) {
		this.totalPagina = totalPagina;
	}
	public double getLarguraCapa() {
		return larguraCapa;
	}
	public void setLarguraCapa(double larguraCapa) {
		this.larguraCapa = larguraCapa;
	}
	public double getAlturaCapa() {
		return alturaCapa;
	}
	public void setAlturaCapa(double alturaCapa) {
		this.alturaCapa = alturaCapa;
	}
	
	
}
