package es.cic.ejerc002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BatidoraTest {
	
	private Batidora cut;

	@BeforeEach
	void setUp() throws Exception {
		cut = new Batidora();
	}

	@Test
	void testSumarMinutosTotalesDeLaReceta() {
		
		CalculadoraFake calculadoraFake = new CalculadoraFake();
		double resultado = 15.5;
		calculadoraFake.setResultado(resultado);
		
		cut.setObjCalculadora(calculadoraFake);
		
		
		cut.calcularTiempoTotalDeReceta(10, 5.5);
		
		assertEquals(15.5, resultado);
	}
	
	@Test
	void testMinutosRestantesParaTerminarReceta() {
		CalculadoraFake calculadoraFake = new CalculadoraFake();		
		
		cut.setObjCalculadora(calculadoraFake);

		
		calculadoraFake.setResultado(15);
		cut.calcularTiempoTotalDeReceta(5, 10);
		
		
		calculadoraFake.setResultado(7);
		cut.calcularMinutosRestantes(8);
		
		
		
		double resultado = cut.getMinutosRestantes();
		
		assertEquals(7, resultado);
	}

}
