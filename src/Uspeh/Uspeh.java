package Uspeh;

import java.util.Scanner;

public class Uspeh {

	public static void metodUspeh(double bodovi) {
		if(bodovi >= 8.5) {
			System.out.println("Odlicen");
		}else if (bodovi >= 7.5) {
			System.out.println("Mnogu dobar");
		}else if (bodovi >= 5.5) {
			System.out.println("Dobar");
		}else if (bodovi >= 3.5) {
			System.out.println("Dovolen");
		}else {
			System.out.println("Nedovolen");
		}
	}
}
	