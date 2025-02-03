package aplikazioa_metodoak;
import java.util.Scanner;
public class erabiltzailea {
	public static boolean erabiltzaileabete(String erabiltzailea, Scanner sc, boolean erabegokia) {
		erabegokia = true;
		System.out.println("Sartu erabiltzailea");
		erabiltzailea = sc.nextLine().trim();
		if (erabiltzailea.equalsIgnoreCase("admin")) {
			erabegokia = true;
		} else {
			erabegokia = false;
		}
		return erabegokia;
	}
}
