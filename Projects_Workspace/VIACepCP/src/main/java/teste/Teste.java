package teste;

import java.io.IOException;

import javax.swing.JOptionPane;

import model.Endereco;
import service.ViacepService;

public class Teste {

	public static void main(String[] args) {

		ViacepService viacepservice = new ViacepService();

		try {
			Endereco endereco = viacepservice.getEndereco(JOptionPane.showInputDialog("Insira o CEP desejado."));

			
			String ddd = endereco.getDdd();
			String uf = endereco.getUf();
			String logradouro = endereco.getLogradouro();
			String cepinput = endereco.getCep();
			String complemento = endereco.getComplemento();
			String cidade = endereco.getLocalidade();
			String bairro = endereco.getBairro();		
			String ibge = endereco.getIbge();
			String gia = endereco.getGia();
			String dddd = endereco.getDdd();
			String siafi = endereco.getSiafi();
			


			
			System.out.println("Os dados relacionados ao seu CEP são: ");
			System.out.println(cepinput);
			System.out.println(cidade);
			System.out.println(complemento);
			System.out.println(bairro);
			System.out.println(cidade);
			System.out.println(uf);
			System.out.println(ibge);
			System.out.println(gia);
			System.out.println(ddd);
			System.out.println(siafi);

		} catch (IOException e) {
// TODO Autogenerated catch block
			e.printStackTrace();
		}
	}
}
