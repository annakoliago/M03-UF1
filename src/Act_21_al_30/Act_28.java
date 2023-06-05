package Act_21_al_30;

import java.util.Scanner;

public class Act_28 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Introdueix un nombre: ");
		int n = scanner.nextInt();
		int count = 0;
		int suma = 0;

		for (int i = 1; count < n; i += 2) {
			suma += i;
			count++;
		}

		System.out.println("La suma dels " + n + " primers nombres imparells és: " + suma);
	}
}