package es.cic.ejerc002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BatidoraIntegrationTest {
	
	private Batidora cut;

	private ICalculadora dependencia;
	
	@BeforeEach
	void setUp() throws Exception {
		cut = new Batidora();
		this.dependencia = new Calculadora();
		cut.setObjCalculadora(dependencia);
	}

	@Test
	void testSumarMinutosTotalesDeLaReceta() {
				
		
		
		cut.calcularTiempoTotalDeReceta(10, 5.5);
		double resultado = cut.getTotalMinutos();
		
		assertEquals(15.5, resultado);
	}
	
	@Test
	void testMinutosRestantesParaTerminarReceta() {
				
		cut.calcularTiempoTotalDeReceta(5, 10);
		cut.calcularMinutosRestantes(8);
		
		double resultado = cut.getMinutosRestantes();
		
		assertEquals(7, resultado);
	}

	
	@Test
	void testBugSumarDespuesDeRestar() {
		cut.calcularTiempoTotalDeReceta(5, 10);
		

		cut.calcularTiempoTotalDeReceta(5, 10);

		double resultado = cut.getTotalMinutos();
		
		assertEquals(15, resultado);
		
	}
}
