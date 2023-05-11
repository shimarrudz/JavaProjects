package br.com.vetoridade.beans;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Vetor simples sem identificação de tamanho
		int[] idade = {37, 35, 56};
		
		System.out.println(idade[0]);
		System.out.println(idade[1]);
		System.out.println(idade[2]);
		
		//Instanciar um vetor com um tamanho
		
		double salario = 3045.22;
		
		int rm[] = new int [3];
		rm[0] = 12334;
		rm[1] = 22334;
		rm[2] = 33441;
		rm[3] = 44332;
		
		//System.out.println(rm[3]); INDEX OUT OF BOUNDS
		System.out.println(rm[1]);

	}

}

