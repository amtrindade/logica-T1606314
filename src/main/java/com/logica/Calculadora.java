package com.logica;

public class Calculadora {

	public Integer soma(Integer valor1, Integer valor2) {
		return valor1 + valor2;		
	}
	
	public Integer subtracao(Integer valor1, Integer valor2) {
		Integer resultado;
		
		if (valor1 > valor2) {
			resultado = valor1 - valor2;
		}
		else if (valor1 < valor2) {
			resultado = valor2 - valor1;
		}
		else
			resultado = 0;
		
		return resultado;
	}
	
}
