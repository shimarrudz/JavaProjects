package br.com.doceriadois.beans;

public class Beijinho extends Doce{

	private double quantidadeCoco;
	private String apelido;
		
	public double getQuantidadeCoco() {
		return quantidadeCoco;
	}

	public void setQuantidadeCoco(double quantidadeCoco) {
		this.quantidadeCoco = quantidadeCoco;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public String mostrarAtributos() {
		return "Quantidade de leite: " + getQuantidadeLeite() +
				"\nQuantidade de a�ucar " + getQuantidadeAcucar() +
				"\nQuantidade de coco " + getQuantidadeCoco() +
				"\nApelido " + getApelido();
	}
	
	//M�todo que retorna no sysou
	public void mostrarOi() {
		System.out.println("Oi");
	}
}

