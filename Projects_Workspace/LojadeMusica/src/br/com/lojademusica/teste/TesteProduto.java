package br.com.lojademusica.teste;

import javax.swing.JOptionPane;

import br.com.lojademusica.beans.Disco;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Orientando vazio
		Disco discoconstrutorvazio = new Disco();
		
		discoconstrutorvazio.setNome(JOptionPane.showInputDialog("Qual o nome do disco"));
		discoconstrutorvazio.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Qual o preço do disco?")));
		discoconstrutorvazio.setMarca(JOptionPane.showInputDialog("A marca do disco?"));
		discoconstrutorvazio.setNomeArtista(JOptionPane.showInputDialog("Qual o nome do artista presente no disco?"));
		discoconstrutorvazio.setQuantMusicas(Integer.parseInt(JOptionPane.showInputDialog("Quantas músicas compoem o disco?")));
		
		
		//Orientando cheio
		
		String NomeDisco = JOptionPane.showInputDialog("Qual o nome do segundo disco?");
		int PrecoDisco = Integer.parseInt(JOptionPane.showInputDialog("Qual o preco do segundo disco?"));
		String MarcaDisco = JOptionPane.showInputDialog("Qual a marca do segundo disco?");
		String NomeArtista = JOptionPane.showInputDialog("Qual o nome do artista presente no álbum");
		int QuantMusicas = Integer.parseInt(JOptionPane.showInputDialog("Quantas musicas compoem o disco"));

		Disco discoConstrutorCheio = new Disco(NomeDisco, PrecoDisco, MarcaDisco,
				NomeArtista, QuantMusicas); 
		
		
		
	System.out.println(discoconstrutorvazio.mostrarAtributos());
	
	
	System.out.println(discoConstrutorCheio.mostrarAtributos());
	}

}
