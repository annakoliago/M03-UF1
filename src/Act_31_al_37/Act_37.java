package Act_31_al_37;

import java.util.Scanner;

public class Act_37 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Introdueix la primera paraula: ");
		String paraula1 = scanner.nextLine();
		System.out.print("Introdueix la segona paraula: ");
		String paraula2 = scanner.nextLine();

		if (paraula1.compareTo(paraula2) < 0) {
			System.out.println(paraula1 + ", " + paraula2);
		} else if (paraula1.compareTo(paraula2) > 0) {
			System.out.println(paraula2 + ", " + paraula1);
		} else {
			System.out.println("Les paraules són iguals.");
		}
	}
}