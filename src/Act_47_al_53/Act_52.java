package Act_47_al_53;

import java.util.Scanner;

public class Act_52 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int[] anysNaixement = new int[10];
		for (int i = 0; i < anysNaixement.length; i++) {
			System.out.print("Introdueix l'any de naixement de l'alumne " + (i + 1) + ": ");
			anysNaixement[i] = scanner.nextInt();
		}
		int anyActual = 2023; 
		int anyMesJove = anyActual;
		int anyMesVell = anysNaixement[0];
		for (int i = 0; i < anysNaixement.length; i++) {
			if (anysNaixement[i] < anyMesJove) {
				anyMesJove = anysNaixement[i];
			}
			if (anysNaixement[i] > anyMesVell) {
				anyMesVell = anysNaixement[i];
			}
		}
		System.out.println("L'alumne més jove té " + (anyActual - anyMesJove) + " anys.");
		System.out.println("L'alumne més vell té " + (anyActual - anyMesVell) + " anys.");
	}

}
