package br.com.fiapecxecaoteste;

public class TesteDoisErros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom = { 2, 2, 0, 2, 0 };
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Resultado: " + numero[i] / denom[i]);
		}

	}

}
