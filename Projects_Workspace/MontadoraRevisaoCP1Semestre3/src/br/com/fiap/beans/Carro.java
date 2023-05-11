package br.com.fiap.beans;

public class Carro extends Veiculo {

	private double capacidadeCombustivel;
	
	
	
	public Carro(String receberMarca, String receberModelo, int receberNumPassageiros) {
		super(receberMarca, receberModelo, receberNumPassageiros);
	}
	//Como seria se nesta classe fosse aplicado construtores com heranças
	/*public Carro(String receberMarca, String receberModelo, int receberNumPassageiros, double receberCapacidadeCombustivel) {
		super(receberMarca, receberModelo, receberNumPassageiros);
		setNumPassageiros(receberNumPassageiros);
	}*/
	
	

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

}
