package br.com.montadoradoze.beans;

public class Veiculo {

	private String modelo;
	private double capacidadeCombustivel;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String receberModelo, double receberCapacidadeCombustivel) {
		setModelo(receberModelo);
		setCapacidadeCombustivel(receberCapacidadeCombustivel);
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
}
