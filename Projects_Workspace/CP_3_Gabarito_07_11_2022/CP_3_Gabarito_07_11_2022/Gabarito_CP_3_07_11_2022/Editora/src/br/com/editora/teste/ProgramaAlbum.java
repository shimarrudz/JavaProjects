package br.com.editora.teste;

import javax.swing.JOptionPane;

import br.com.editora.beans.Album;

public class ProgramaAlbum {

	public static void main(String[] args) {

		Album albumConstrutorVazio = new Album();

		albumConstrutorVazio.setNome(JOptionPane.showInputDialog("Digite o nome do álbum (construtor vazio):"));
		albumConstrutorVazio.setTipoCapa(JOptionPane.showInputDialog("Digite o tipo de capa:"));
		albumConstrutorVazio.setTotalPagina(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o total de páginas (construtor vazio):")));
		albumConstrutorVazio.setLarguraCapa(
				Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da capa (construtor vazio):")));
		albumConstrutorVazio.setAlturaCapa(
				Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da capa (construtor vazio):")));
		albumConstrutorVazio.setTipoFigurinha(JOptionPane.showInputDialog(
				"Digite o tipo de figurinha do álbum (Exemplo: Copa do mundo, turma da mônica, etc) (construtor vazio):"));
		albumConstrutorVazio.setQuantidadeFigurinha(
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de figurinhas (construtor vazio):")));
		albumConstrutorVazio.setAlturaFigurinha(
				Double.parseDouble(JOptionPane.showInputDialog("Digite a altura das figurinhas (construtor vazio):")));
		albumConstrutorVazio.setLarguraFigurinha(
				Double.parseDouble(JOptionPane.showInputDialog("Digite a largura das figurinhas (construtor vazio):")));

		// Album albumConstrutorCheio = new Album();

		String nomeAlbum = JOptionPane.showInputDialog("Digite o nome do álbum (construtor cheio):");
		String tipoCapa = JOptionPane.showInputDialog("Digite o tipo de capa (construtor cheio):");
		int totalPagina = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o total de páginas (construtor cheio):"));
		double larguraCapa = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a largura da capa (construtor cheio):"));
		double alturaCapa = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a altura da capa (construtor cheio):"));
		String tipoFigurinha = JOptionPane.showInputDialog(
				"Digite o tipo de figurinha do álbum (Exemplo: Copa do mundo, turma da mônica, etc) (construtor cheio):");
		int quantidadeFigurinha = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade de figurinhas do álbum (construtor cheio):"));
		double alturaFigurinha = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a altura das figurinhas do álbum (construtor cheio):"));
		double larguraFigurinha = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a largura das figurinhas do álbum (construtor cheio):"));

		Album albumConstrutorCheio = new Album(nomeAlbum, tipoCapa, totalPagina, larguraCapa, alturaCapa, tipoFigurinha,
				quantidadeFigurinha, alturaFigurinha, larguraFigurinha);

		
		albumConstrutorVazio.calcularAreaFigurinha();
		System.out.println(albumConstrutorVazio.mostrarAtributos());

		
		albumConstrutorCheio.calcularAreaFigurinha();
		System.out.println(albumConstrutorCheio.mostrarAtributos());
	}
}
