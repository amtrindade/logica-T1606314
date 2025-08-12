package com.logica;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc01 = new Calculadora();
		
		Integer total = calc01.soma(10, 25);
		
		System.out.println("A soma da calculadora é: "+total);

	}

}
