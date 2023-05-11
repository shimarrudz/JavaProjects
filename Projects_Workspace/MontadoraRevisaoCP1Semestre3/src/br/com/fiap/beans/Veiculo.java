package br.com.fiap.beans;

public class Veiculo {

	private String marca;
	private String modelo;
	private int numPassageiros;
	
	public Veiculo()
	{
		
	}
	
	public Veiculo(String receberMarca, String receberModelo, int receberNumPassageiros) {
		setMarca(receberMarca);
		setModelo(receberModelo);
		setNumPassageiros(receberNumPassageiros);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

}
