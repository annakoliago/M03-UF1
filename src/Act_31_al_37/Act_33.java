package Act_31_al_37;

public class Act_33 {
	public static void main(String[] args) {
		String str = "Hola, món!";
		boolean trobat = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				trobat = true;
				break;
			}
		}

		if (trobat) {
			System.out.println("S'ha trobat una 'a'.");
		} else {
			System.out.println("No s'ha trobat cap 'a'.");
		}
	}
}