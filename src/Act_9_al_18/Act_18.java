package Act_9_al_18;

import java.util.Scanner;

public class Act_18 {
	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int numAlumne = 1;
        double notaPractica, notaProblemes, notaTeoria, notaFinal;
        
        while (true) {
            System.out.println("Alumne " + numAlumne + ":");
            
            System.out.print("Introdueix la nota de la part pràctica (entre 1 i 10): ");
            notaPractica = scanner.nextDouble();
            
            System.out.print("Introdueix la nota de la part de problemes (entre 1 i 10): ");
            notaProblemes = scanner.nextDouble();
            
            System.out.print("Introdueix la nota de la part teòrica (entre 1 i 10): ");
            notaTeoria = scanner.nextDouble();
            
            if (notaPractica == 0 && notaProblemes == 0 && notaTeoria == 0) {
                break;
            }
            
            if (notaPractica < 1 || notaPractica > 10 || notaProblemes < 1 || notaProblemes > 10 || notaTeoria < 1 || notaTeoria > 10) {
                System.out.println("Error: les notes han d'estar entre 1 i 10.");
                continue;
            }
            
            notaFinal = (notaPractica * 0.1) + (notaProblemes * 0.5) + (notaTeoria * 0.4);
            System.out.println("La nota final de l'alumne " + numAlumne + " és: " + notaFinal);
            
            numAlumne++;
        }
    }
}
