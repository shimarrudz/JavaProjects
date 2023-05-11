package br.com.excecaotesterevisao.teste;

public class TesteDoisErrosVersaoQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom = { 2, 2, 0, 2, 0 };

		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println("Resultado: " + numero[i] / denom[i]);
			}
//Usando dois catchs de uma vez so, porem deve ser usado para frase genérica
// catch (ArithmeticException | ArrayOutOfBoundsException exc)
			catch (ArithmeticException exc) {
				System.out.println("Aconteceu um erro."); 
			}
		}
}
}

