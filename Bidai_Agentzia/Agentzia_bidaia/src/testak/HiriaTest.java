package testak;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modeloa.Hiria;

public class HiriaTest {
	private Hiria hiria;

	@BeforeEach
	void setUp() {
		// Inicializamos el objeto Hiria con datos de prueba.
		hiria = new Hiria("001", "Madrid");
	}

	@Test
	void testHiriaCreation() {
		// Verificamos que el objeto se crea correctamente con los valores del
		// constructor.
		assertEquals("001", hiria.getIdHirira());
		assertEquals("Madrid", hiria.getHiria());
	}

	@Test
	void testSetterAndGetter() {
		// Probar el setter y getter de 'hiria' y verificar si el valor se asigna
		// correctamente.
		hiria.setHiria("Barcelona");
		assertEquals("Barcelona", hiria.getHiria());
	}

	@Test
	void testToString() {
		// Verificamos que el método toString devuelva la cadena correcta.
		String expectedString = "Hiria [idHirira=001, hiria=Madrid]";
		assertEquals(expectedString, hiria.toString());
	}

}
