package br.com.fiapecxecaoteste;

public class TesteExitDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idadeUm = 37;
		int idadeDois = 35;
		int soma = idadeUm + idadeDois;
		
		System.out.println(soma);
		System.exit(0); //O exit ignora o que tem abaixo dele
		System.out.println(soma);
				

	}

}
