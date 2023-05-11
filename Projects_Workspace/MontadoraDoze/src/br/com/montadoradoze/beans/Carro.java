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
	
	//m�todo mostrar atributos do tipo return String
	public String mostrarAtributos() {
		return "Modelo " + getModelo() + "\n" +
	"Capacidade combust�vel " + getCapacidadeCombustivel() + "\n" +
	"Quantidade Janela " + getQuantidadeJanela() + "\n"
				;
	}
	
	//m�todo vazio que quando chamado ir� retornar um SYSOU
	public void calcularTotalCombustivel(double novaQuantidade) {
		double capacidadeFinal = novaQuantidade + getCapacidadeCombustivel();
		System.out.println("A nova capacidade do tanque do carro � " + capacidadeFinal);
	}
	
	public void calcularTotalCombustivelVersaoDois(double receberAdicional) {
		double novaCapacidade = getCapacidadeCombustivel() + receberAdicional;
		if(novaCapacidade >= 60) {
			System.out.println("� poss�vel ir at� o Rio de Janeiro com essa capacidade");
		}
		else {
			System.out.println("N�O � poss�vel ir at� o Rio de Janeiro com essa capacidade");
		}
	}
}