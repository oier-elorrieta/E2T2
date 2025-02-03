package testak;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modeloa.Aireportua;

public class AireportuTest {
	private Aireportua aireportua;

	@BeforeEach
	void setUp() {
		// Inicializamos el objeto Aireportua con valores de prueba.
		aireportua = new Aireportua("BCN", "Barcelona-El Prat");
	}

	@Test
	void testAireportuaCreation() {
		// Verificamos que el objeto se crea correctamente con los valores del
		// constructor.
		assertEquals("BCN", aireportua.getIdAireportua());
		assertEquals("Barcelona-El Prat", aireportua.getAireportua());
	}

	@Test
	void testSetterAndGetter() {
		// Probar los setters y getters.
		aireportua.setIdAireportua("MAD");
		aireportua.setAireportua("Madrid-Barajas");

		assertEquals("MAD", aireportua.getIdAireportua());
		assertEquals("Madrid-Barajas", aireportua.getAireportua());
	}

	@Test
	void testToString() {
		// Verificamos que el método toString devuelve la cadena correcta.
		String expectedString = "Aireportua [idAireportua=BCN, aireportua=Barcelona-El Prat]";
		assertEquals(expectedString, aireportua.toString());
	}

}
