package br.com.excecaotesterevisao.teste;

public class TesteDoisErrosVersaoNove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Começou o programa " + "\n");
		try {
			String nomeRecebido = devolverNome();
			System.out.println("Nome " + nomeRecebido);
		}
		catch (Exception e) {
			System.out.println("Problema na chamada de método");
			e.printStackTrace();
		}

	}
	
	public static String devolverNome() throws Exception {
		return "Victor Shimada";
	}

}
