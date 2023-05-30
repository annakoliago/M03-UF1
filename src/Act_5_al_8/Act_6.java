package Act_5_al_8;

import java.util.Scanner;

public class Act_6 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.print("Introdueix una mesura en centímetres: ");
		double centimetres = scanner.nextDouble();

		double polzades = centimetres / 2.54;

		System.out.println("La mesura en polzades és: " + polzades);

	}
}