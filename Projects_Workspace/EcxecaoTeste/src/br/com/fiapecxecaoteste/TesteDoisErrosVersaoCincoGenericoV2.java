package br.com.fiapecxecaoteste;

public class TesteDoisErrosVersaoCincoGenericoV2 {
	/**
	 * Foi criado com erro, para testar o Throwable, sendo colocado primeiro que a
	 * busca dos erros específicos
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom = { 2, 2, 0, 2, 0 };
		
		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println("Resulado: " + numero[i] / denom[i]);
			} 
			
			
			catch (ArithmeticException exc) {
				System.out.println(
						"Ocorreu um erro durante a execução do for," + " pois tentou dividir um número por zero");
			}
			
			catch (Throwable exc) {
				System.out.println("Ocorreu um erro.");
			} 
			
			
		}
	}
}