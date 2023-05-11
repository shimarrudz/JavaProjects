package br.com.montadoradoze.teste;

import javax.swing.JOptionPane;

import br.com.montadoradoze.beans.Carro;

public class ProgramaCarro {

	public static void main(String[] args) {

		//instanciar um objeto com o construtor vazio
		Carro carro = new Carro();
		
		carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro"));
		carro.setCapacidadeCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite a capacidade do combustível")));
		carro.setQuantidadeJanela(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas")));
		
		System.out.println(carro.mostrarAtributos());
		carro.calcularTotalCombustivel(20);
		
		//instanciar um objeto com o construtor cheio
		
		//Carro carroConstrutorCheio = new Carro("Tipo", 43.5, 10);
		
		
		String recebeModelo = JOptionPane.showInputDialog("Digite o modelo do carro");
		double recebeCapacidadeCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite a capacidade de combustível"));
		int recebeQuantidadeJanela = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas"));
		
		Carro carroConstrutorCheio = new Carro(recebeModelo, recebeCapacidadeCombustivel, recebeQuantidadeJanela);
		
		System.out.println(carroConstrutorCheio.mostrarAtributos());
		carroConstrutorCheio.calcularTotalCombustivel(20);
		carroConstrutorCheio.calcularTotalCombustivelVersaoDois(20);
	}
}
