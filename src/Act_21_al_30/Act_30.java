package Act_21_al_30;

import java.util.Scanner;

public class Act_30 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int suma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Introdueix el nombre " + i + ": ");
			int num = scanner.nextInt();
			suma += num;
		}

		double mitjana = (double) suma / 10;
		System.out.println("La mitjana aritmètica és: " + mitjana);
	}
}