package Act_9_al_18;

import java.util.Scanner;

public class Act_10 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int num1, num2, num3;

		System.out.print("Introdueix el primer nombre: ");
		num1 = scanner.nextInt();
		System.out.print("Introdueix el segon nombre: ");
		num2 = scanner.nextInt();
		System.out.print("Introdueix el tercer nombre: ");
		num3 = scanner.nextInt();

		if (num1 + num2 == num3) {
			System.out.println(num3 + " és la suma de " + num1 + " i " + num2);
		} else if (num1 + num3 == num2) {
			System.out.println(num2 + " és la suma de " + num1 + " i " + num3);
		} else if (num2 + num3 == num1) {
			System.out.println(num1 + " és la suma de " + num2 + " i " + num3);
		} else {
			System.out.println("Cap dels nombres és la suma dels altres dos.");
		}
	}
}