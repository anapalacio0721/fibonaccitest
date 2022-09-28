package com.example.fibonacciseg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fibonacciseg.controller.FibonacciDTO;

@SpringBootTest
class FibonaccisegApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testFibonacciServiceCorrect1();{
		List<String> serieFibonacci = new ArrayList<>();   //hora no sea null
		FibonacciDTO fibonacciDTO = new FibonacciDTO("7", "59", "59", "59", "14"); //Clase - nombreobjeto
		FibonacciDTO respuesta = FibonacciService.resultadoSegundos(fibonacciDTO);
		assertEquals(70, a);;
	}

}

