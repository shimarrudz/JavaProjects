package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;



public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String receberMarca = JOptionPane.showInputDialog("Qual a marca do carro?");
		String receberModelo = "Civic";
		int receberNumPassageiros = 5;
		
		
		Carro carro = new Carro(receberMarca, receberModelo, receberNumPassageiros);
		
		carro.setCapacidadeCombustivel(55.50);;
		
		System.out.println("O nome da marca é: " + carro.getMarca() +
				"\n O modelo do carro é: " + carro.getModelo()  +
				"\n O número de passageiros é: " + carro.getNumPassageiros() + 
			"\n A capacidade de combustível é: " + carro.getCapacidadeCombustivel())
					;
		

	}

}
