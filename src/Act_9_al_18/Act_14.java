package Act_9_al_18;

import java.util.Scanner;

public class Act_14 {
	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int num;
        
        System.out.print("Introdueix el primer nombre (0 per acabar): ");
        num = scanner.nextInt();
        
        while (num != 0) {
            if (num < 0) {
                System.out.println("La seqüència no està formada exclusivament per valors positius.");
                return;
            }
            
            System.out.print("Introdueix el següent nombre (0 per acabar): ");
            num = scanner.nextInt();
        }
        
        System.out.println("La seqüència està formada exclusivament per valors positius.");
    }
}

