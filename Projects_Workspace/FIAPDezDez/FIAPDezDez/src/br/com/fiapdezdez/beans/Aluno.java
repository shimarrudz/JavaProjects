package br.com.fiapdezdez.beans;

public class Aluno extends Pessoa{

	private String matricula;

	//Construtor vazio
	public Aluno() {
		
	}
	
	//Construtor cheio
	public Aluno(String recebeNome, int recebeIdade, String recebeMatricula) {
		super(recebeNome, recebeIdade);
		setMatricula(recebeMatricula);
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
