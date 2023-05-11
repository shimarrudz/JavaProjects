package br.com.escolavetor.teste;

import br.com.escolavetor.beans.Professor;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Professor instanciado
		Professor p = new Professor();
		
		//Instanciar um vetor objeto Professor
		Professor[] professor = new Professor[3];
		
		//Adicionando valores nos objetos com vetores
		professor[0] = new Professor();
		professor[0].setNome("Victor");
		professor[0].setSalario(3556.50);
		professor[0].setCurso("ADS");
		
		professor[1] = new Professor();
		professor[1].setNome("Beatriz Arantes");
		professor[1].setSalario(4556.99);
		professor[1].setCurso("Arquitetura");

		professor[2] = new Professor();
		professor[2].setNome("Mie Shimada");
		professor[2].setSalario(5400.99);
		professor[2].setCurso("Ingles");

		
		for(int i = 0; 
				i < 3;
				i++) {
			System.out.println(professor[i].getNome() + "\n" +
				professor[i].getSalario() + "\n" +
					professor[i].getCurso() + "\n");
		}
	}

}
