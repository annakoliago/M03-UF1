package Act_21_al_30;

import java.util.Scanner;

public class Act_27 {
	private static Scanner scanner;

	public static void main(String[] args) {
	scanner = new Scanner(System.in);
	int count = 0;
	int suma = 0;

	while (count < 5) {
	    System.out.print("Introdueix un nombre: ");
	    int num = scanner.nextInt();
	    
	    if (num % 2 != 0) {
	        suma += num;
	        count++;
	    }
	}

	System.out.println("La suma dels 5 primers nombres imparells és: " + suma);

}
}