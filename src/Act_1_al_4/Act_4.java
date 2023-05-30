package Act_1_al_4;

import java.util.Scanner;

public class Act_4 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.print("Introdueix un número enter: ");
		int numero = scanner.nextInt();

		int ultimaCifra = numero % 10;

		System.out.println("La última xifra del número és: " + ultimaCifra);

	}
}