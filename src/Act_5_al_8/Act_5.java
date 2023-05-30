package Act_5_al_8;

import java.util.Scanner;

public class Act_5 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.print("Introdueix la base del triangle: ");
		double base = scanner.nextDouble();

		System.out.print("Introdueix l'altura del triangle: ");
		double altura = scanner.nextDouble();

		double area = (base * altura) / 2;
		double perimetre = base + altura + Math.sqrt(base * base + altura * altura);

		System.out.println("L'àrea del triangle és: " + area);
		System.out.println("El perímetre del triangle és: " + perimetre);

	}
}
