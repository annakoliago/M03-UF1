package Act_47_al_53;

public class Act_47 {
	public static void main(String[] args) {
		int[] notes = { 5, 7, 8, 3, 9, 6, 4, 7, 8, 10 }; 
		int aprovats = 0;
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] >= 5) {
				aprovats++;
			}
		}
		double percentatgeAprovats = (double) aprovats / notes.length * 100;
		System.out.println("Percentatge d'aprovats: " + percentatgeAprovats + "%");
	}
}