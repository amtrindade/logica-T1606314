package com.logica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	Calculadora calculadora;
	
	@BeforeEach
	public void setUp() {
		calculadora = new Calculadora();
	}
	

	@Test
	public void testSomaDoisValoresPositivos() {
		Integer total = calculadora.soma(8, 20);	
		assertEquals(28, total);	
	}
	
	@Test
	public void testSomaDoisValoresUmNegativo() {
		assertEquals(5, calculadora.soma(-1, 6));		
	}
	
	@Test
	public void somaDoisValoresUmZerado() {
		assertEquals(14, calculadora.soma(0, 14));		
	}
	
	@Test
	public void somaDoisValoresNegativos() {
		assertEquals(-24, calculadora.soma(-9, -15));		
	}
	
	@Test
	public void subtraiDoisNumerosValor1Maior() {
		Integer resultado = calculadora.subtracao(75, 20);
		assertEquals(55, resultado);
		
	}
	
	@Test
	public void subtraiDoisNumerosValor1Menor() {
		Integer resultado = calculadora.subtracao(5, 20);
		assertEquals(15, resultado);
	}
	
	@Test
	public void subtraiDoisValoresIguais() {
		Integer resultado = calculadora.subtracao(20, 20);
		assertEquals(0, resultado);
	}
	
	@Test
	public void fatorialDeCinco() {
		Integer resultado = calculadora.fatorial(5);
		assertEquals(120, resultado);
		
	}
	
	@Test
	public void fatorialDeUm() {
		Integer resultado = calculadora.fatorial(1);
		assertEquals(1, resultado);
		
	}
	
	@Test
	public void fatorialDeZero() {
		Integer resultado = calculadora.fatorial(0);
		assertEquals(1, resultado);
	}
	
	@Test
	public void fatorialDeValorNegativo() {
		Integer resultado = calculadora.fatorial(-1);
		assertEquals(0, resultado);
	}

}
