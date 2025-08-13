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

	public Integer fatorial(Integer valor) {
		if (valor < 0) {
			return 0;
		}
		
		Integer fatorial = 1;
		
		for (int i = 1; i <= valor ; i++) {
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}
	
}
