package br.com.montadoraonze.teste;

import javax.swing.JOptionPane;

import br.com.montadoraonze.beans.Carro;

public class ProgramaCarro {

	public static void main(String[] args) {
		
		//Constsrutor cheio
		
		String receberModelo = JOptionPane.showInputDialog("Digite o modelo para o construtor cheio");
		double receberCapacidadeCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite a capacidade do combust�vel para o construtor cheio"));
		int receberQuantidadeJanelas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas para o construtor cheio"));
		
		Carro carro = new Carro(receberModelo, receberCapacidadeCombustivel, receberQuantidadeJanelas);
		
		System.out.println("Valores do objeto do construtor cheio " + "\n" +
				"O modelo � " + carro.getModelo() + "\n" +
				"A capacidade do tanque de combust�vel � " + carro.getCapacidadeCombustivel() + "\n" +
				"Quantidade de janelas" + carro.getQuantidadeJanelas() + "\n"
		  		);
		
		//Construtor apenas com o atributo modelo
		
		String receberModeloDois = JOptionPane.showInputDialog("Digite o modelo para o construtor apenas com esse atributo");

		Carro carroDois = new Carro(receberModeloDois);
		
		System.out.println("Valores do objeto do construtor com um atributo que � o modelo " + "\n" +
				"O modelo � " + carroDois.getModelo() + "\n");		

		
		//Construtor apenas com o atributo capacidadeCombust�vel
		
		double receberCapacidadeCombustivelTres = Double.parseDouble(JOptionPane.showInputDialog("Digite a capacidade do combust�vel para o construtor cheio"));
				
		Carro carroTres = new Carro(receberCapacidadeCombustivelTres);
		
		System.out.println("Valores do objeto do construtor com um atributo que � a capacidade do combust�vel" + "\n" +
				"A capacidade do tanque de combust�vel � " + carroTres.getCapacidadeCombustivel() + "\n"
				);
		
		//Construtor apenas com o atributo quantidadeJanelas
		
				int receberQuantidadeJanelasQuatro = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas para o construtor cheio"));
				
				Carro carroQuatro = new Carro(receberQuantidadeJanelasQuatro);
				
				System.out.println("Valores do objeto do construtor com um atributo que � a quantidade de janelas" + "\n" +
						"Quantidade de janelas " + carroQuatro.getQuantidadeJanelas() + "\n"
						);
		
		
		//Construtor com dois par�metros - Atributos: Modelo e capacidadeCombustivel
				
				String receberModeloCinco = JOptionPane.showInputDialog("Digite o modelo para o construtor cheio");
				double receberCapacidadeCombustivelCinco = Double.parseDouble(JOptionPane.showInputDialog("Digite a capacidade do combust�vel para o construtor cheio"));
								
				Carro carroCinco = new Carro(receberModeloCinco, receberCapacidadeCombustivelCinco);
				
				System.out.println("Valores do objeto do construtor com os atributos modelo e capacidade de combust�vel" + "\n" +
						"O modelo � " + carroCinco.getModelo() + "\n" +
						"A capacidade do tanque de combust�vel � " + carroCinco.getCapacidadeCombustivel() + "\n"
						);				
		
		//Instanciando com o construtor vazio
		Carro carroSeis = new Carro();
		
		carroSeis.setModelo(JOptionPane.showInputDialog("Digite o modelo para o construtor cheio"));
		carroSeis.setCapacidadeCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite a capacidade do combust�vel para o construtor cheio")));
		carroSeis.setQuantidadeJanelas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas para o construtor cheio")));
		
		System.out.println("Valores do objeto do construtor cheio " + "\n" +
				"O modelo � " + carroSeis.getModelo() + "\n" +
				"A capacidade do tanque de combust�vel � " + carroSeis.getCapacidadeCombustivel() + "\n" +
				"Quantidade de janelas" + carroSeis.getQuantidadeJanelas() + "\n"
				);	
	}

}
