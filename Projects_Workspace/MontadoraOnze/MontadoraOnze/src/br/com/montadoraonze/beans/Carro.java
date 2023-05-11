package br.com.montadoraonze.beans;

public class Carro {

	private String modelo;
	private double capacidadeCombustivel;
	private int quantidadeJanelas;

	public Carro () {
		
	}
	
	public Carro (String receberModelo, double receberCapacidadeCombustivel, int receberQuantidadeJanelas) {
		setModelo(receberModelo);
		setCapacidadeCombustivel(receberCapacidadeCombustivel);
		setQuantidadeJanelas(receberQuantidadeJanelas);
	}
	
	
	public Carro (String recebeModelo){
		setModelo(recebeModelo);
	}
	
	
	public Carro (double recebeCapacidadeCombustivel){
		setCapacidadeCombustivel(recebeCapacidadeCombustivel);
	}
	
	public Carro (int recebeQuantidadeJanelas){
		setQuantidadeJanelas(recebeQuantidadeJanelas);
	}
	
	public Carro (String recebeModelo, double recebeCapacidadeCombustivel) {
		setModelo(recebeModelo);
		setCapacidadeCombustivel(recebeCapacidadeCombustivel);
	}

	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public int getQuantidadeJanelas() {
		return quantidadeJanelas;
	}

	public void setQuantidadeJanelas(int quantidadeJanelas) {
		this.quantidadeJanelas = quantidadeJanelas;
	}

}
