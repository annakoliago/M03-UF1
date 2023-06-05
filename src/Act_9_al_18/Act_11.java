package Act_9_al_18;

import java.util.Scanner;

public class Act_11 {
	 public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		int num1, num2, num3, aux;
		
		System.out.print("Introdueix el primer nombre: ");
		num1 = scanner.nextInt();
		System.out.print("Introdueix el segon nombre: ");
		num2 = scanner.nextInt();
		System.out.print("Introdueix el tercer nombre: ");
		num3 = scanner.nextInt();

		if (num1 > num2) {
		    aux = num1;
		    num1 = num2;
		    num2 = aux;
		}
		
		if (num1 > num3) {
		    aux = num1;
		    num1 = num3;
		    num3 = aux;
		}
		
		if (num2 > num3) {
		    aux = num2;
		    num2 = num3;
		    num3 = aux;
		}
		
		System.out.println("Els nombres ordenats són: " + num1 + ", " + num2 + ", " + num3);
	}
}}
