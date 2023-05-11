package br.comlojamusicadois.beans;

public class Instrumeto extends Produto{

	private String marcaInstrumento;
	private String tipoInstrumento;
	private int quantCordas;
	
	
	//Construtor vazio
	public Instrumeto() {
		
	}
	
	public Instrumeto(String receberMarcaInstrumento, String receberTipoInstrumento,
			int receberQuantCordas) {
		super(receberCodProdutos, receberPreco);
		setMarcaInstrumento(receberMarcaInstrumento);
		setTipoInstrumento(receberTipoInstrumento);
		setQuantCordas(receberQuantCordas);
	}

	public String getMarcaInstrumento() {
		return marcaInstrumento;
	}

	public void setMarcaInstrumento(String marcaInstrumento) {
		this.marcaInstrumento = marcaInstrumento;
	}

	public String getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	public int getQuantCordas() {
		return quantCordas;
	}

	public void setQuantCordas(int quantCordas) {
		this.quantCordas = quantCordas;
	}

}
