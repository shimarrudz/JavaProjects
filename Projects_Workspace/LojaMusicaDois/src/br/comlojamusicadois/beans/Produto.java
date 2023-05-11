package br.comlojamusicadois.beans;

public class Produto {
	
	private String codProduto;
	private double preco;
	
	
	//Construtor vazio
	public Produto() {
		
	}
	
	//Construtor cheio
	public Produto(String receberCodProduto, double receberPreco){
		setCodProduto(receberCodProduto);
		setPreco(receberPreco);
	}
	
	/*Construtor de um atributo versao um
	public Produto(String receberCodProduto) {
		setCodProduto(receberCodProduto);
	}
	
	//Construutor de um atributo versao dois
	public Produto(double receberPreco) {
		setPreco(receberPreco);
	}
	*/
	
	public String getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
