package testak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import modeloa.Agentzia;
import modeloa.Bidaia;

public class AgentziaTest {
	private Agentzia agentzia;
	private Bidaia[] bidaiak;

	@BeforeEach
	void setUp() {

		bidaiak = new Bidaia[0];

		//agentzia = new Agentzia(1, "Euskadi Tours", "Urdina", "L123", "A001", "logo.png", "admin", "1234", bidaiak);
	}

	@Test
	void testAgentziaCreation() {

		assertEquals(1, agentzia.getIdAgentzia());
		assertEquals("Euskadi Tours", agentzia.getIzena());
		assertEquals("Urdina", agentzia.getKolorea());
		assertEquals("L123", agentzia.getLangile_kod());
		assertEquals("A001", agentzia.getAgentzia_kod());
		assertEquals("logo.png", agentzia.getLogo());
		assertEquals("admin", agentzia.getErabiltzailea());
		assertEquals("1234", agentzia.getPasahitza());
		assertNotNull(agentzia.getBidaiak());
		assertEquals(0, agentzia.getBidaiak().length);
	}

	@Test
	void testSettersAndGetters() {

		agentzia.setIdAgentzia(2);
		agentzia.setIzena("Bilbao Travel");
		agentzia.setKolorea("Berdea");
		agentzia.setLangile_kod("L456");
		agentzia.setAgentzia_kod("A002");
		agentzia.setLogo("new_logo.png");
		agentzia.setErabiltzailea("user");
		agentzia.setPasahitza("abcd");

		Bidaia[] newBidaiak = new Bidaia[2];
		agentzia.setBidaiak(newBidaiak);

		assertEquals(2, agentzia.getIdAgentzia());
		assertEquals("Bilbao Travel", agentzia.getIzena());
		assertEquals("Berdea", agentzia.getKolorea());
		assertEquals("L456", agentzia.getLangile_kod());
		assertEquals("A002", agentzia.getAgentzia_kod());
		assertEquals("new_logo.png", agentzia.getLogo());
		assertEquals("user", agentzia.getErabiltzailea());
		assertEquals("abcd", agentzia.getPasahitza());
		assertEquals(2, agentzia.getBidaiak().length);
	}

	@Test
	void testToString() {
		String expectedString = "Agentzia [idAgentzia=1, izena=Euskadi Tours, kolorea=Urdina, langile_kod=L123, "
				+ "agentzia_kod=A001, logo=logo.png, erabiltzailea=admin, pasahitza=1234]";
		assertEquals(expectedString, agentzia.toString());
	}

}
