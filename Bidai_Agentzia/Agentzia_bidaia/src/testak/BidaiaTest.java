package testak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modeloa.Bidaia;
import modeloa.Ekitaldi;

import java.util.Date;

public class BidaiaTest {
	@Test
	public void testSetGetIdentifikatzailea() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		bidaia.setIdentifikatzailea(100);
		assertEquals(100, bidaia.getIdentifikatzailea());
	}

	@Test
	public void testSetGetIzena() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		bidaia.setIzena("Bidaia Test");
		assertEquals("Bidaia Test", bidaia.getIzena());
	}

	@Test
	public void testSetGetDeskribapena() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		bidaia.setDeskribapena("Nueva Deskribapena");
		assertEquals("Nueva Deskribapena", bidaia.getDeskribapena());
	}

	@Test
	public void testSetGetMota() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		bidaia.setMota("Nueva Mota");
		assertEquals("Nueva Mota", bidaia.getMota());
	}

	@Test
	public void testSetGetDataJoan() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		Date nuevaData = new Date();
		bidaia.setDataJoan(nuevaData);
		assertEquals(nuevaData, bidaia.getDataJoan());
	}

	@Test
	public void testSetGetDataEtor() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		Date nuevaData = new Date();
		bidaia.setDataEtor(nuevaData);
		assertEquals(nuevaData, bidaia.getDataEtor());
	}

	@Test
	public void testSetGetIraupenJoan() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		bidaia.setIraupenJoan(15);
		assertEquals(15, bidaia.getIraupenJoan());
	}

	@Test
	public void testSetGetIraupenEtor() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		bidaia.setIraupenEtor(20);
		assertEquals(20, bidaia.getIraupenEtor());
	}

	@Test
	public void testSetGetHelmugaHerri() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		bidaia.setHelmugaHerri("Herri Test");
		assertEquals("Herri Test", bidaia.getHelmugaHerri());
	}

	@Test
	public void testSetGetHerriDeskribapena() {
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", null);
		bidaia.setHerriDeskribapena("Deskribapena Herri Test");
		assertEquals("Deskribapena Herri Test", bidaia.getHerriDeskribapena());
	}

	@Test
	public void testToString() {
		Ekitaldi[] ekitaldiak = new Ekitaldi[0]; // Si Ekitaldi está implementado, usa un array adecuado
		Bidaia bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", "Mota1", new Date(), new Date(), 10, 12, "Herri1",
				"DeskribapenaHerri", ekitaldiak);
		String expected = "Bidaia [identifikatzailea=1, izena=Bidaia1, deskribapena=Deskribapena1, mota=Mota1, dataJoan="
				+ bidaia.getDataJoan() + ", dataEtor=" + bidaia.getDataEtor()
				+ ", iraupenJoan=10, iraupenEtor=12, helmugaHerri=Herri1, herriDeskribapena=DeskribapenaHerri]";
		assertEquals(expected, bidaia.toString());
	}

}
