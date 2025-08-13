package com.logica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testSomaDoisValoresPositivos() {
		
		Calculadora calculadora = new Calculadora();
		
		Integer total = calculadora.soma(8, 20);
		
		assertEquals(28, total);	
	}
	
	@Test
	public void testSomaDoisValoresUmNegativo() {
		Calculadora calc01 = new Calculadora();
		assertEquals(5, calc01.soma(-1, 6));		
	}
	
	@Test
	public void somaDoisValoresUmZerado() {
		Calculadora calc01 = new Calculadora();
		assertEquals(14, calc01.soma(0, 14));		
	}
	
	@Test
	public void somaDoisValoresNegativos() {
		Calculadora calc01 = new Calculadora();
		assertEquals(-24, calc01.soma(-9, -15));		
	}
	
	@Test
	public void subtraiDoisNumerosValor1Maior() {
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.subtracao(75, 20);
		assertEquals(55, resultado);
		
	}
	
	@Test
	public void subtraiDoisNumerosValor1Menor() {
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.subtracao(5, 20);
		assertEquals(15, resultado);
	}
	
	@Test
	public void subtraiDoisValoresIguais() {
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.subtracao(20, 20);
		assertEquals(0, resultado);
	}
	
	@Test
	public void fatorialDeCinco() {
		Calculadora calc = new Calculadora();
		Integer resultado = calc.fatorial(5);
		assertEquals(120, resultado);
		
	}
	
	@Test
	public void fatorialDeUm() {
		Calculadora calc = new Calculadora();
		Integer resultado = calc.fatorial(1);
		assertEquals(1, resultado);
		
	}
	
	@Test
	public void fatorialDeZero() {
		Calculadora calc = new Calculadora();
		Integer resultado = calc.fatorial(0);
		assertEquals(1, resultado);
	}
	
	@Test
	public void fatorialDeValorNegativo() {
		Calculadora calc = new Calculadora();
		Integer resultado = calc.fatorial(-1);
		assertEquals(0, resultado);
	}

}
