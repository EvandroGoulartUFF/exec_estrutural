package jokenpo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JokenpoTest {

	Jokenpo jokenpo;
	Integer resultado;
	
	@BeforeEach
	void setUp() {
		jokenpo = new Jokenpo();
	}
	
	// Considerando o GFD da classe Jokenpo
	// Complexidade Ciclomática = 10 - 8 + 2 = 4
	
	// Caminho básico = {1, 2, 3, 4, 7, 10}
	@Test
	void test_P1Papel_P2Tesoura() {
		resultado = jokenpo.jogar(1, 3);
		assertEquals(2, resultado);
	}
	
	// Caminho básico = {1, 2, 3, 4, 5, 10}
	@Test
	void test_P1Tesoura_P2Papel() {
		resultado = jokenpo.jogar(3, 1);
		assertEquals(1, resultado);
	}
	
	// Caminho básico = {1, 2, 3, 10}
	@Test
	void testEmpate() {
		resultado = jokenpo.jogar(1, 1);
		assertEquals(0, resultado);
	}
	
	// Caminho básico = {1, 2, 9, 10}
	@Test
	void test_P1Papel_P2InvalidoMaior() {
		resultado = jokenpo.jogar(1, 4);
		assertEquals(-1, resultado);
	}
	
	// Todos nós já foram testados até esse ponto
	// Testando arestas restantes

	@Test
	void test_P1Papel_P2InvalidoMenor() {
		resultado = jokenpo.jogar(1, -2);
		assertEquals(-1, resultado);
	}
	
	@Test
	void test_P1InvalidoMaior_P2Papel() {
		resultado = jokenpo.jogar(4, 1);
		assertEquals(-1, resultado);
	}
	
	@Test
	void test_P1InvalidoMenor_P2Papel() {
		resultado = jokenpo.jogar(-3, 1);
		assertEquals(-1, resultado);
	}
	
	@Test
	void test_P1MenosP2Igual2() {
		resultado = jokenpo.jogar(-2, 4);
		assertEquals(-1, resultado);
	}
	
	@Test
	void test_P1MenosP2Igual1Negativo() {
		resultado = jokenpo.jogar(1, 2);
		assertEquals(1, resultado);
	}
	
}