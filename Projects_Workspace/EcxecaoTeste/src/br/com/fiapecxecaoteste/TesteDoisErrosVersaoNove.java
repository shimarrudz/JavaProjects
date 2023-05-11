package br.com.fiapecxecaoteste;

import

public class TesteDoisErrosVersaoNove {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	public static void main(String[] args) {
			        System.out.println("Entre com a idade do Aluno: ");
			        try {
			            int recebeNum = lerIdade();
			            System.out.println("Você digitou o número " + recebeNum);
			        } 
			        catch (Exception e) {
			            System.out.println("Entrada inválida ao receber a idade do aluno.");
			            //e.printStackTrace();
			        }
			        System.out.println("Entre com a idade do Professor: ");
			        try {
			            int recebeNum = lerIdade();
			            System.out.println("Você digitou o número " + recebeNum);
			        } 
			        catch (Exception e) {
			            System.out.println("Entrada inválida ao receber a idade do professor.");
			            //e.printStackTrace();
			        }
			    }    

	public static int lerIdade() throws Exception {
			        Scanner scan = new Scanner(System.in);
			        int recebeNum = scan.nextInt();
			        return recebeNum;
			    } 

}}
