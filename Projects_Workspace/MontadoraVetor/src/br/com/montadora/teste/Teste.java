package br.com.montadora.teste;
import javax.swing.JOptionPane;

import br.com.montadora.beans.Carro;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciando o objeto carro, nao pode repetir nome
		Carro c = new Carro();
		
		//Instanciando um vetor
		Carro[] carro = new Carro[3];
		
		//Declarando valores nos vetores
		carro[0] = new Carro();
		carro[0].setNome(JOptionPane.showInputDialog("Digite o nome do carro"));
		carro[0].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do carro: ")));
		carro[0].setQuantidadeJanela(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas: ")));
		
		carro[1] = new Carro();
		carro[1].setNome(JOptionPane.showInputDialog("Digite o nome do carro"));
		carro[1].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do carro: ")));
		carro[1].setQuantidadeJanela(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas: ")));
		
		carro[2] = new Carro();
		carro[2].setNome(JOptionPane.showInputDialog("Digite o nome do carro"));
		carro[2].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do carro: ")));
		carro[2].setQuantidadeJanela(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas: ")));
		
		/*
		for(int i = 0; 
			i < 3;
			i++) {
			System.out.println("O nome do carro: " + carro[i].getNome() + "\n" + 
								"O peso do carro: " + carro[i].getPeso() + "\n" +
								"A quantidade de janelas do carro: " + carro[i].getQuantidadeJanela() + "\n");
		}*/
	
		
		//Outra forma de usar o for
		for (Carro car: carro) {
			System.out.println(car.getNome() + "\n"+ 
					car.getPeso() + "\n" +
					car.getQuantidadeJanela() + "\n");
			
		}
		
	}
	

}
