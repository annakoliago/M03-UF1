package Act_9_al_18;

import java.util.Scanner;

public class Act_15 {
	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int num, parells = 0, imparells = 0;
        
        System.out.print("Introdueix el primer nombre (0 per acabar): ");
        num = scanner.nextInt();
        
        while (num != 0) {
            if (num % 2 == 0) {
                parells++;
            } else {
                imparells++;
            }
            
            System.out.print("Introdueix el següent nombre (0 per acabar): ");
            num = scanner.nextInt();
        }
        
        System.out.println("Hi ha " + parells + " nombres parells i " + imparells + " nombres imparells.");
    }
}
