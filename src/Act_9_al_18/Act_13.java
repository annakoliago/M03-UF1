package Act_9_al_18;

import java.util.Scanner;

public class Act_13 {
	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int num;
        
        System.out.print("Introdueix un nombre: ");
        num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El nombre és parell.");
        } else {
            System.out.println("El nombre és imparell.");
        }
    }
}


