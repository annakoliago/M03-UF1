package Act_9_al_18;

import java.util.Scanner;

public class Act_9 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.print("Introdueix el primer nombre: ");
		int num1 = scanner.nextInt();

		System.out.print("Introdueix el segon nombre: ");
		int num2 = scanner.nextInt();

		int major = Math.max(num1, num2);
		int menor = Math.min(num1, num2);

		double resultat = (double) major / menor;

		System.out.println("El resultat de la divisió del major entre el menor és: " + resultat);

	}
}