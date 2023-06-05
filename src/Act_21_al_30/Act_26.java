package Act_21_al_30;

import java.util.Scanner;

public class Act_26 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Introdueix un número: ");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}