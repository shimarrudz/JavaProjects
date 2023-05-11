package br.com.montadoradoze.beans;

public class Carro extends Veiculo{
	
	private int quantidadeJanela;
	
	//construtor vazio
	public Carro () {
		
	}
	
	//construtor cheio
	public Carro (String receberModelo, double receberCapacidadeCombustivel, int receberQuantidadeJanela) {
		super(receberModelo, receberCapacidadeCombustivel);
		setQuantidadeJanela(receberQuantidadeJanela);
	}
	
	public int getQuantidadeJanela() {
		return quantidadeJanela;
	}

	public void setQuantidadeJanela(int quantidadeJanela) {
		this.quantidadeJanela = quantidadeJanela;
	}
	
	//método mostrar atributos do tipo return String
	public String mostrarAtributos() {
		return "Modelo " + getModelo() + "\n" +
	"Capacidade combustível " + getCapacidadeCombustivel() + "\n" +
	"Quantidade Janela " + getQuantidadeJanela() + "\n"
				;
	}
	
	//método vazio que quando chamado irá retornar um SYSOU
	public void calcularTotalCombustivel(double novaQuantidade) {
		double capacidadeFinal = novaQuantidade + getCapacidadeCombustivel();
		System.out.println("A nova capacidade do tanque do carro é " + capacidadeFinal);
	}
	
	public void calcularTotalCombustivelVersaoDois(double receberAdicional) {
		double novaCapacidade = getCapacidadeCombustivel() + receberAdicional;
		if(novaCapacidade >= 60) {
			System.out.println("É possível ir até o Rio de Janeiro com essa capacidade");
		}
		else {
			System.out.println("NÃO é possível ir até o Rio de Janeiro com essa capacidade");
		}
	}
}