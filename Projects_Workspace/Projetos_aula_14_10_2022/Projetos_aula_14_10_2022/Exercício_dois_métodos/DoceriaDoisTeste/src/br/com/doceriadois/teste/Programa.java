package br.com.doceriadois.teste;

import javax.swing.JOptionPane;

import br.com.doceriadois.beans.Beijinho;
import br.com.doceriadois.beans.Brigadeiro;

public class Programa {

	public static void main(String[] args) {
		
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setQuantidadeLeite(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a quantidade de Leite")));
		brigadeiro.setQuantidadeAcucar(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a quantidade de açucar")));
		brigadeiro.setQuantidadeChocolate(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a quantidade de chocolate")));
		
		//Instan1ciar o objeto beijinho
		
		Beijinho beijinho = new Beijinho();
		
		beijinho.setQuantidadeLeite(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a quantidade de leite")));
		beijinho.setQuantidadeAcucar(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a quantidade de açucar")));
		beijinho.setQuantidadeCoco(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a quantidade de coco")));
		beijinho.setApelido(JOptionPane.showInputDialog("Digite o apelido"));
		
		System.out.println(beijinho.mostrarAtributos());	
		beijinho.mostrarOi();
	}
}
