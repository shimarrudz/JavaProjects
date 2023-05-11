package br.com.empresa.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.empresa.beans.Cargos;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cargos cargosUm = new Cargos();
		
		cargosUm.setCargo("Desenvolvedor Front-End");
		cargosUm.setNivel("Junior");
		cargosUm.setSalario(2500.99);
		
		Cargos cargosDois = new Cargos();
		
		cargosDois.setCargo("Arquitetura");
		cargosDois.setNivel("Projetista");
		cargosDois.setSalario(5000.10);
		
		Cargos cargosTres = new Cargos();
		
		cargosTres.setCargo("Java Develloper");
		cargosTres.setNivel("Senior");
		cargosTres.setSalario(9000.90);
		
		//Instanciando um ArrayList do tipo objeto Cargos
		List<Cargos> cargos = new ArrayList<Cargos>();
		cargos.add(cargosUm);
		cargos.add(cargosDois);
		cargos.add(cargosTres);
		
		System.out.println(cargos.size());
		//cargos.remove(1);
		System.out.println(cargos.size());
		
		for (Cargos c : cargos) {
			System.out.println(c.getCargo() + "\n" + c.getNivel() + "\n" + c.getSalario() + "\n");
		}
		
		
		

	}

}
