package br.com.excecaotesterevisao.teste;

public class TesteDoisErrosVersaoCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numero = {2, 4, 8, 16, 32, 64};
		int[] denom = {2, 2, 0, 2, 0};
		
		for (int i = 0;
				i < numero.length;
				i++) {
			try {
			System.out.println("Resultado: " + numero[i] / denom[i]);
		}
		
		
		catch (ArithmeticException exc) {
			System.out.println("Ocorreu um erro durante a execução do for..");
		}
			
			//Generaliza o erro
		catch (Throwable exc) {
			System.out.println("Ocorreu algum erro.");
		}

	}

}
}
