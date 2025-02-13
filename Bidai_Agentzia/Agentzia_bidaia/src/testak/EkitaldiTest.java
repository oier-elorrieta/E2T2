package testak;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import modeloa.Ekitaldi;

import java.util.Date;

public class EkitaldiTest {
	private Ekitaldi ekitaldi;
	private Date irteeraData;
	private Date irteeraDataBuel;

	@BeforeEach
	void setUp() {
		irteeraData = new Date();
		irteeraDataBuel = new Date();

		ekitaldi = new Ekitaldi("EK001", "BD001", "Hegaldia", "Hegaldia Internacional", "Bilbao", "Madrid", irteeraData,
				1234, 15, "Iberia", 100, "2h 30m", "Madrid", "Bilbao", irteeraDataBuel, 4321, 18, "Air Europa", 90,
				"2h", "Barcelona", 10, 20, "SGL01", 150, "Hotel comfortable", 2025);
	}

	@Test
	void testEkitaldiCreation() {
		// Verificamos que los valores asignados al crear el objeto sean correctos
		assertEquals("EK001", ekitaldi.getEkitaldi_id());
		assertEquals("BD001", ekitaldi.getBidai_id());
		assertEquals("Hegaldia", ekitaldi.getIzena());
		assertEquals("Hegaldia Internacional", ekitaldi.getBidai_mota());
		assertEquals("Bilbao", ekitaldi.getJatorriAireport());
		assertEquals("Madrid", ekitaldi.getHelmugAireport());
		assertNotNull(ekitaldi.getIrteeraData());
		assertEquals(1234, ekitaldi.getHegaldiKodJoan());
		assertEquals(15, ekitaldi.getIrteeraordu());
		assertEquals("Iberia", ekitaldi.getJoanAirelinea());
		assertEquals(100, ekitaldi.getPrezioaJoan());
		assertEquals("2h 30m", ekitaldi.getJoanIraupen());
	}

	@Test
	void testSettersAndGetters() {
		ekitaldi.setHiria("Valencia");
		ekitaldi.setSarreraEgun(12);
		ekitaldi.setIrteeraEgun(22);

		assertEquals("Valencia", ekitaldi.getHiria());
		assertEquals(12, ekitaldi.getSarreraEgun());
		assertEquals(22, ekitaldi.getIrteeraEgun());
	}

	@Test
	void testToString() {
		String expectedString = "Ekitaldi [ekitaldi_id=EK001, bidai_id=BD001, izena=Hegaldia, bidai_mota=Hegaldia Internacional, "
				+ "jatorriAireport=Bilbao, helmugAireport=Madrid, irteeraData=" + irteeraData
				+ ", hegaldiKodJoan=1234, irteeraordu=15, joanAirelinea=Iberia, prezioaJoan=100, "
				+ "joanIraupen=2h 30m, jatorriAireportBuel=Madrid, helmugAireportBuel=Bilbao, irteeraDataBuel="
				+ irteeraDataBuel
				+ ", hegaldiKodBuel=4321, irteeraorduBuel=18, EtorAirelinea=Air Europa, prezioaBuel=90, EtorIraupen=2h, "
				+ "hiria=Barcelona, sarreraEgun=10, irteeraEgun=20, logela_kod=SGL01, prezioaOstatua=150, "
				+ "deskribapena=Hotel comfortable, data=2025]";
		assertEquals(expectedString, ekitaldi.toString());
	}

	@Test
	void testDefaultValues() {
		Ekitaldi defaultEkitaldi = new Ekitaldi("EK002", "BD002", "Ostatua", "Hotel", "Paris", "Londres", new Date(),
				5678, 20, "Air France", 120, "1h 30m", "London", "Paris", new Date(), 8765, 10, "British Airways", 110,
				"2h", "Madrid", 7, 15, "DBL01", 180, "Hotel deluxe", 2025);
		assertNotNull(defaultEkitaldi.getEkitaldi_id());
	}

}
