package br.com.editora.beans;

public class Album extends Revista {
	private String tipoFigurinha;
	private int quantidadeFigurinha;
	private double alturaFigurinha;
	private double larguraFigurinha;

	public Album() {

	}

	public Album(String receberNome, String receberTipoCapa, int receberTotalPagina, double receberLarguraCapa,
			double receberAlturaCapa, String receberTipoFigurinha, int receberQuantidadeFigurinha,
			double receberAlturaFigurinha, double receberLarguraFigurinha) {
		super(receberNome, receberTipoCapa, receberTotalPagina, receberLarguraCapa, receberAlturaCapa);

		setTipoFigurinha(receberTipoFigurinha);
		setQuantidadeFigurinha(receberQuantidadeFigurinha);
		setAlturaFigurinha(receberAlturaFigurinha);
		setLarguraFigurinha(receberLarguraFigurinha);
	}

	public String getTipoFigurinha() {
		return tipoFigurinha;
	}

	public void setTipoFigurinha(String tipoFigurinha) {
		this.tipoFigurinha = tipoFigurinha;
	}

	public int getQuantidadeFigurinha() {
		return quantidadeFigurinha;
	}

	public void setQuantidadeFigurinha(int quantidadeFigurinha) {
		this.quantidadeFigurinha = quantidadeFigurinha;
	}

	public double getAlturaFigurinha() {
		return alturaFigurinha;
	}

	public void setAlturaFigurinha(double alturaFigurinha) {
		this.alturaFigurinha = alturaFigurinha;
	}

	public double getLarguraFigurinha() {
		return larguraFigurinha;
	}

	public void setLarguraFigurinha(double larguraFigurinha) {
		this.larguraFigurinha = larguraFigurinha;
	}
	
	public String mostrarAtributos() {
		return "Nome do álbum: " + getNome() + "\n" +
				"Tipo da capa: " + getTipoCapa() + "\n" +
				"Total de páginas: " + getTotalPagina() + "\n" +
				"Largura da capa: "  + getLarguraCapa() + "\n" +
				"Altura da capa: "  + getAlturaCapa() + "\n" +
				"Tipo de figurinha: "  + getTipoFigurinha() + "\n" +
				"Quantidade de figurinhas: "  + getQuantidadeFigurinha() + "\n" +
				"Altura das figurinhas: "  + getAlturaFigurinha() + "\n" +
				"Largura das figurinhas: "  + getLarguraFigurinha() + "\n"
		;
	}
	
	public void calcularAreaFigurinha() {
		double calcularArea = getAlturaFigurinha() * getLarguraFigurinha();
		if(calcularArea > 12) {
			System.out.println("A área da figurinha em centímetros é maior que 12 centímetros quadrados");	
		}
		else {
			System.out.println("A área da figurinha é igual ou menor que 12 centímetros quadrados.");
		}
		
	}
}