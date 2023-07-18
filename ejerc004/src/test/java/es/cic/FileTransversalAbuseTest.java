package es.cic;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileTransversalAbuseTest {

	
	private Fichero fichero;
	
	@BeforeEach
	public void setup() {
		this.fichero=new FicheroImpl();
		
	}
	
	@Test
	public void testAbrirFicheroConTransversal() {
		BufferedReader f  = fichero.abrirFichero("../fileTransversalNodisponible.txt");
		
		asserThat(f, is(nullValue()));
	}

}
