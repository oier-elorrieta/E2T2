package testak;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modeloa.Herrialdeak;

public class HerrialdeTest {
	private Herrialdeak herrialdeak;

	@BeforeEach
	void setUp() {
		// Inicializamos el objeto Herrialdeak con datos de prueba.
		herrialdeak = new Herrialdeak("ES", "España");
	}

	@Test
	void testHerrialdeakCreation() {
		// Verificamos que el objeto se crea correctamente con los valores del
		// constructor.
		assertEquals("ES", herrialdeak.getIdHerrialdeak());
		assertEquals("España", herrialdeak.getHerrialdeak());
	}

	@Test
	void testSetterAndGetter() {
		// Probar el setter y getter de 'herrialdeak' y verificar si el valor se asigna
		// correctamente.
		herrialdeak.setHerrialdeak("Francia");
		assertEquals("Francia", herrialdeak.getHerrialdeak());
	}

	@Test
	void testToString() {
		// Verificamos que el método toString devuelva la cadena correcta.
		String expectedString = "Herrialdeak [idHerrialdeak=ES, herrialdeak=España]";
		assertEquals(expectedString, herrialdeak.toString());
	}

}
