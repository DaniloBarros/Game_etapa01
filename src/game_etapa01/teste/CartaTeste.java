package game_etapa01.teste;

//import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import game_etapa01.entidades.Monstro;

public class CartaTeste extends TestCase {
	
	public CartaTeste(){
		super();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}

	@Test
	public void testGetNum() {
		Monstro Esqueleto = new Monstro();
		Esqueleto.criarCarta("Esqueleto", 5, 2, 1);
		assertEquals(Esqueleto.getNum(),1);
		
	}

}
