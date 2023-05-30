package Act_5_al_8;

import java.util.Scanner;

public class Act_8 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Introdueix el total de quilòmetres recorreguts: ");
		double quilometres = scanner.nextDouble();

		System.out.print("Introdueix el preu de la gasolina (per litre): ");
		double preuGasolina = scanner.nextDouble();

		System.out.print("Introdueix els diners gastats en gasolina durant el viatge: ");
		double dinersGasolina = scanner.nextDouble();

		System.out.print("Introdueix el temps transcorregut (hores): ");
		int hores = scanner.nextInt();

		System.out.print("Introdueix el temps transcorregut (minuts): ");
		int minuts = scanner.nextInt();

		double consumPer100Km = (dinersGasolina / preuGasolina) * 100;
		double consumPerKm = (dinersGasolina / preuGasolina) / quilometres;
		double velocitatKmH = quilometres / (hores + (minuts / 60.0));
		double velocitatMS = velocitatKmH * 1000 / 3600;

		System.out.println(
				"Consum de gasolina per cada 100 km: " + consumPer100Km + " litres, " + dinersGasolina + " euros.");
		System.out.println("Consum de gasolina per cada km: " + consumPerKm + " litres, " + dinersGasolina + " euros.");
		System.out.println("Velocitat mitjana: " + velocitatKmH + " km/h, " + velocitatMS + " m/s.");
	}
}