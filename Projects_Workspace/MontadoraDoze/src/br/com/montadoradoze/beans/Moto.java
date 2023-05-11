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

	// m�todo mostrar atributos do tipo return String
	public String mostrarAtributos() {
		return "Modelo " + getModelo() + "\n" + "Capacidade combust�vel " + getCapacidadeCombustivel() + "\n"
				+ "Quantidade Adesivo " + getQuantidadeAdesivo();
	}

	// m�todo vazio que quando chamado ir� retornar um SYSOU
	public void calcularTotalCombustivel(double novaQuantidade) {
		double capacidadeFinal = novaQuantidade + getCapacidadeCombustivel();
		System.out.println("A nova capacidade do tanque da moto � " + capacidadeFinal);
	}
}
