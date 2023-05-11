package br.com.montadoradoze.beans;

public class Moto extends Veiculo {

	private int quantidadeAdesivo;

	// construtor vazio
	public Moto() {

	}

	// construtor cheio
	public Moto(String receberModelo, double receberCapacidadeCombustiver, int receberQuantidadeAdesivo) {
		super(receberModelo, receberCapacidadeCombustiver);
		setQuantidadeAdesivo(receberQuantidadeAdesivo);
	}

	public int getQuantidadeAdesivo() {
		return quantidadeAdesivo;
	}

	public void setQuantidadeAdesivo(int quantidadeAdesivo) {
		this.quantidadeAdesivo = quantidadeAdesivo;
	}

	// método mostrar atributos do tipo return String
	public String mostrarAtributos() {
		return "Modelo " + getModelo() + "\n" + "Capacidade combustível " + getCapacidadeCombustivel() + "\n"
				+ "Quantidade Adesivo " + getQuantidadeAdesivo();
	}

	// método vazio que quando chamado irá retornar um SYSOU
	public void calcularTotalCombustivel(double novaQuantidade) {
		double capacidadeFinal = novaQuantidade + getCapacidadeCombustivel();
		System.out.println("A nova capacidade do tanque da moto é " + capacidadeFinal);
	}
}
