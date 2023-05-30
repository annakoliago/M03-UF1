package Act_1_al_4;

import java.util.Scanner;

public class Act_3 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.print("Insereix el primer número: ");
		int numero1 = scanner.nextInt();

		System.out.print("Insereix el segon número: ");
		int numero2 = scanner.nextInt();

		int suma = numero1 + numero2;
		System.out.println("Suma: " + suma);

		int resta = numero1 - numero2;
		System.out.println("Resta: " + resta);

		int multiplicacio = numero1 * numero2;
		System.out.println("Multiplicació: " + multiplicacio);

		if (numero2 != 0) {
			double divisio = (double) numero1 / numero2;
			System.out.println("Divisió: " + divisio);
		} else {
			System.out.println("No es possible dividir entre zero.");
		}

		if (numero2 != 0) {
			int modul = numero1 % numero2;
			System.out.println("Mòdul de la división: " + modul);
		} else {
			System.out.println("No es posible calcular el módulo de la división entre cero.");
		}

		int resultatInvertit = numero2 - numero1;
		System.out.println("Resultat invertit dels operadors: " + resultatInvertit);

	}
}
