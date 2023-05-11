package br.com.testevetor.teste;


import javax.swing.JOptionPane;

public class Vetor {
    public static void main(String[] args) {
        double[] salario = new double[3];
        double[] aumento = { 1.1, 1.15 };

        // Recebe os salários e armazena no vetor salario
        for (int i = 0; i < salario.length; i++) {
            try {
                salario[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário " + (i + 1)));
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Você tentou colocar um valor num espaço inexistente");
  
            }
        }
 

        // Aplica os aumentos nos salários e armazena no vetor salario
        for (int i = 0; i < salario.length; i++) {
            if (salario[i] >= 2000) {
                salario[i] *= aumento[0];
            } else {
                salario[i] *= aumento[1];
            }
        }

 
        for (int i = 0;
        		i < salario.length;
        		i ++)
        System.out.println("O " + i + " salário é " + salario[i]);

    }
}
