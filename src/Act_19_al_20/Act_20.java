package Act_19_al_20;

import java.util.Scanner;

public class Act_20 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int num1, num2, opcio;
		boolean sortir = false;

		while (!sortir) {
			System.out.print("Escriu el número 1: ");
			num1 = scanner.nextInt();
			System.out.print("Escriu el número 2: ");
			num2 = scanner.nextInt();

			System.out.println("Què vols fer?");
			System.out.println("0. Sortir");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.print("Opció: ");
			opcio = scanner.nextInt();

			switch (opcio) {
			case 0:
				sortir = true;
				break;
			case 1:
				System.out.println("Resultat: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Resultat: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Resultat: " + (num1 * num2));
				break;
			default:
				System.out.println("Opció incorrecta.");
				break;
			}

			if (!sortir) {
				System.out.println();
			}
		}

		System.out.println("Fins aviat!");
	}
}