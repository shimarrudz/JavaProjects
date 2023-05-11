package br.com.excecaotesterevisao.teste;

public class TesteDoisErrosVersaoSeteFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom = { 2, 2, 0, 2, 0 };
		int[] resul = { 1, 2, 3, 4, 5, 6 };
		
		
		for (int i = 0; i < numero.length; i++) {
			
			try {
				System.out.println("Resulado: " + numero[i] / denom[i]);
				resul[i] = numero[i] / denom[i];
			} catch (ArithmeticException exc) {
				System.out.println(
						"Ocorreu um erro durante a execução do for," + " pois tentou dividir um número por zero");
			}
			/**
			 * @author Ronqui Throwable é a superclasse que captura todos os erros e
			 *         exceções no Java
			 */
			catch (Throwable exc) {
				System.out.println("Ocorreu um erro.");
			} finally {
				System.out.println("Utilizando o finally, após o try catch.");
			}
		}
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println(resul[i]);
		}

	}

}