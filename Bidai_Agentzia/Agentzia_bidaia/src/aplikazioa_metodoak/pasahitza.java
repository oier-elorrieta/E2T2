package aplikazioa_metodoak;
import java.util.Scanner;
public class pasahitza {
	public static boolean pasahitzabete(String pasahitza, Scanner sc, boolean pasegokia) {
		System.out.println("Sartu pasahitza");
		pasahitza = sc.nextLine().trim();
		if (pasahitza.equalsIgnoreCase("admin")) {
			pasegokia = true;
		} else {
			pasegokia = false;
		}
		return pasegokia;
	}
}
