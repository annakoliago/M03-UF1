package Act_1_al_4;

import java.util.Scanner;

public class Act_1 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		/*
		 * Demanar a l'usuari la inserció de la distància en milles marines.
		 */
		System.out.print("Insereix la distància en millas marines: ");
		double millasMarinas = scanner.nextDouble();

		// Conversió de milles a metres.
		double metros = millasMarinas * 1852;

		// Mresultado
		System.out.println("La distància en metres es: " + metros);

	}
}