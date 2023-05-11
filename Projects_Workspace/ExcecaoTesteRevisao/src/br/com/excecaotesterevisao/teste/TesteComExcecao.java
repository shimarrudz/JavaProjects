package br.com.excecaotesterevisao.teste;

public class TesteComExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Try esta tratando o erro
		try {
			int[] vetor = new int[3];
			vetor[3] = 1;
			System.out.println("Excecao criada para quando tentar acessar" + "um indice do vetor");
		} catch (ArrayIndexOutOfBoundsException exception) {
			//ArrayIndexOutOfBoundsException erro citado
			System.out.println("Excecao ao acessar um índice do vetor que não existe");
		}
		//A linha a baixo so funciona pela existencia do try e catch
		System.out.println("Esse texto está após a execução do try e do exception");
	
	}

}
