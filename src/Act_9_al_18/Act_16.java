package Act_9_al_18;

import java.util.Scanner;

public class Act_16 {
	 private static Scanner scanner;

	public static void main(String[] args) {
	        scanner = new Scanner(System.in);
	        int num1, num2, suma;
	        
	        System.out.print("Introdueix el primer nombre: ");
	        num1 = scanner.nextInt();
	        
	        System.out.print("Introdueix el segon nombre: ");
	        num2 = scanner.nextInt();
	        
	        while (num1 != 0 || num2 != 0) {
	            suma = num1 + num2;
	            System.out.println(num1 + " + " + num2 + " = " + suma);
	            
	            System.out.print("Introdueix el primer nombre: ");
	            num1 = scanner.nextInt();
	            
	            System.out.print("Introdueix el segon nombre: ");
	            num2 = scanner.nextInt();
	        }
	        
	        System.out.println("S'ha detectat una suma de zeros. Programa finalitzat.");
	    }
	
}
