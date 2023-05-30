package Act_1_al_4;

import java.util.Scanner;

public class Act_2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.print("Insereix el preu de la tarifa: ");
		double preuTarifa = scanner.nextDouble();

		System.out.print("Insereix el preu pagat: ");
		double preuPagat = scanner.nextDouble();

		double descompte = ((preuTarifa - preuPagat) / preuTarifa) * 100;

		System.out.println("El porcentatge de descompte es: " + descompte + "%");

	}
}
