package Act_9_al_18;

import java.util.Scanner;

public class Act_12 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int num1, num2, resultat;

		System.out.print("Introdueix el primer nombre: ");
		num1 = scanner.nextInt();
		System.out.print("Introdueix el segon nombre: ");
		num2 = scanner.nextInt();

		if (num2 != 0) {
			resultat = num1 / num2;
			System.out.println("El resultat de la divisió és: " + resultat);
		} else {
			System.out.println("Error: no es pot dividir entre zero.");
		}
	}
}