package Act_47_al_53;

import java.util.Scanner;

public class Act_53 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int[] ingressos = new int[12];
		String[] mesos = { "gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre",
				"novembre", "desembre" };
		for (int i = 0; i < ingressos.length; i++) {
			System.out.print("Introdueix els ingressos del mes de " + mesos[i] + ": ");
			ingressos[i] = scanner.nextInt();
		}
		System.out.print("Introdueix la quantitat que vols cercar: ");
		int quantitatCercada = scanner.nextInt();
		boolean trobat = false;
		for (int i = 0; i < ingressos.length; i++) {
			if (ingressos[i] == quantitatCercada) {
				System.out.println("Joan ha rebut " + quantitatCercada + " durant el mes de " + mesos[i] + ".");
				trobat = true;
				break;
			}
		}
		if (!trobat) {
			System.out.println("Joan no ha rebut " + quantitatCercada + " durant cap mes.");
		}
	}
}
