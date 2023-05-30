package Act_5_al_8;

import java.util.Scanner;

public class Act_7 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.print("Introdueix el temps en segons: ");
		int tempsTotal = scanner.nextInt();

		int hores = tempsTotal / 3600;
		int minuts = (tempsTotal % 3600) / 60;
		int segons = tempsTotal % 60;

		System.out.println("Temps equivalent: " + hores + " hores, " + minuts + " minuts, " + segons + " segons.");

	}
}