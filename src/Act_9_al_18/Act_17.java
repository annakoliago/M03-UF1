package Act_9_al_18;

import java.util.Scanner;

public class Act_17 {
	  private static Scanner scanner;

	public static void main(String[] args) {
	        scanner = new Scanner(System.in);
	        int horesSetmanals;
	        double preuHora, salari;
	        
	        System.out.print("Introdueix les hores setmanals treballades: ");
	        horesSetmanals = scanner.nextInt();
	        
	        System.out.print("Introdueix el preu hora: ");
	        preuHora = scanner.nextDouble();
	        
	        if (horesSetmanals > 40) {
	            double salariNormal = 40 * preuHora;
	            double horesExtra = horesSetmanals - 40;
	            double salariExtra = horesExtra * (preuHora * 1.5);
	            salari = salariNormal + salariExtra;
	        } else {
	            salari = horesSetmanals * preuHora;
	        }
	        
	        System.out.println("El salari setmanal és: " + salari);
	    }
	}
