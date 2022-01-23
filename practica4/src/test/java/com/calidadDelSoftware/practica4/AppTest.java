package com.calidadDelSoftware.practica4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
	
	int ladosTriangulo = 3;
	int ladosRectangulo = 4;
	String areaTriangulo = "(BASE x ALTURA) / 2";
	String areaRectangulo = "BASE x ALTURA";
	String areaTrianguloDePenrose = null;
	String areaDesconocida = "Ni idea";
	String[] areasEsperadas = {"Triángulo: (BASE x ALTURA) / 2", "Rectángulo: BASE x ALTURA", "Triángulo de Penrose: no se puede calcular, al ser un objeto imposible"};
	String[] areasResultantes = {"Triángulo: (BASE x ALTURA) / 2", "Rectángulo: BASE x ALTURA", "Triángulo de Penrose: no se puede calcular, al ser un objeto imposible"};

	App poligono = new App(ladosTriangulo,areaTriangulo);

	@Before
	public void setUp() throws Exception {
		System.out.println("Inicia el test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finaliza el test");
	}
	
	@BeforeClass
	public static void beforeAll(){
		System.out.println("Inicio test principal.");
	}
	 
	@AfterClass
	public static void afterAll(){
		System.out.println("Fin test principal.");
	}
	
	@Ignore("Todavía falta implementarlo.")
		@Test(expected = Exception.class)
		 public void testExcepcion(){
			System.out.println(Integer.parseInt("1111111111111111111111111111111"));
		 }

	@Test
	public void testGetLados() {
		assertTrue(ladosTriangulo < ladosRectangulo);
		assertFalse(ladosTriangulo > ladosRectangulo);
		assertEquals(ladosTriangulo, poligono.getLados());
	}

	@Test
	public void testGetArea() {
		assertArrayEquals(areasEsperadas, areasResultantes);
		assertSame(areaDesconocida, poligono.getArea());
		assertNotSame(null, areaTrianguloDePenrose);
		assertNotNull(areaTrianguloDePenrose);
		assertNull(areaRectangulo);
	}

}

