package br.com.gabaritodois.teste;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero = { 4, 4, 2, 8, 16, 32, 64 };
		int[] denominador = { 2, 0, 2, 0, 2 };

		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println("Resultado: " + numero[i] / denominador[i]);
			} catch (ArithmeticException ecx) {
				System.out.println("Ocorreu um erro durante a execução do for, pois tentou dividir um número por zero");
			} catch (Throwable exc) {
				System.out.println("Ocorreu um erro.");
			}
		}
	}
}
