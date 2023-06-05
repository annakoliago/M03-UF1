package Act_19_al_20;

import java.util.Scanner;

public class Act_19 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int numAleatori = (int) (Math.random() * 96) + 5;
		int vides = 3;

		System.out.println("Benvingut al joc d'endevinar nombres!");
		System.out.println("He pensat en un nombre entre 5 i 100. Tens " + vides + " vides.");

		while (vides > 0) {
			System.out.print("Introdueix un nombre: ");
			int numUsuari = scanner.nextInt();

			if (numUsuari == numAleatori) {
				System.out.println("Felicitats, has guanyat!");
				break;
			} else {
				vides--;
				System.out.println("Error, el nombre introduït no és correcte. Et queden " + vides + " vides.");
			}

			if (vides == 0) {
				System.out.println("Has perdut, el nombre era " + numAleatori + ".");
			}
		}
	}
}
