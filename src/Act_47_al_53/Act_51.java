package Act_47_al_53;

import java.util.Scanner;

public class Act_51 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introdueix un valor per a la posició " + i + ": ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Introdueix el valor que vols buscar: ");
		int valorBuscat = scanner.nextInt();
		boolean trobat = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valorBuscat) {
				System.out.println("El valor " + valorBuscat + " es troba a la posició " + i);
				trobat = true;
				break;
			}
		}
		if (!trobat) {
			System.out.println("El valor " + valorBuscat + " no es troba a l'array.");
		}
	}
}