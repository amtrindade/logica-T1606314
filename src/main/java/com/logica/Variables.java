package com.logica;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Variables {

	public static void main(String[] args) {
		
		//Variáveis do tipo String
		String name = "Antônio";
		String fullName = "Trindade";
		
		System.out.println(name + " " + fullName);
		
		//Variáveis do tipo Integer
		
		Integer valor01 = 5;
		Integer valor02 = 12;
		
		Integer total = valor01 + valor02;
		
		System.out.println("O valor da soma é: "+ total);
		
		//Variáveis do tipo Double 
		Double valor03 = 45.98;
		Double valor04 = 4.03;
		
		Double totalDouble = valor03 * valor04;
		
		System.out.println("O valor da multiplicação é: "+ totalDouble);
		
		//Variáveis do tipo Boolean
		
		Boolean casado = false;
		if (casado == true) {
			System.out.println("A pessoa é casada!!");
		}
		else {
			System.out.println("A pessoa não é casada!!!");
		}
		
		//Variáveis do tipo Date
		Date atualData = new Date();
		System.out.println("A data atual é "+ atualData);
		
		//Conversão de string para integer
		Integer year = Integer.parseInt("2025");
		Double salary = Double.parseDouble("2550.90");		
		
		System.out.println("O ano é: "+year);
		System.out.println("O salário é R$ "+salary);
		
		//looping com valor inicial e final
		for (int i = 1; i <=10; i++) {
			System.out.println("O valor de i é: "+ i);
		}
		
		//looping com while 
		int i = 1;
		
		while (i <=10) {
			System.out.println("O valor de i no while é: "+ i);
			i = i + 1;			
		}
		
		//looping em lista
		List<String> produtos = new ArrayList<String>();
		
		produtos.add("iPhone X");
		produtos.add("Boobie goods");
		produtos.add("Canetas colorir");
		produtos.add("Fone de ouvido JBL");
		
		for (String produto : produtos) {
			System.out.println("O produto agora é: " + produto);
		}
		
		System.out.println("O tamanho da lista é: " + produtos.size());
		System.out.println("O segundo item da lista é: "+produtos.get(1));
	}

}
