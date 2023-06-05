package Act_31_al_37;

public class Act_34 {
	public static void main(String[] args) {
		String str = "Hola, món!";
		int count = 0;
		boolean trobat = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				trobat = true;
			}

			if (trobat) {
				count++;
			}
		}

		System.out.println("Hi ha " + count + " caràcters a partir de la primera 'a'.");
	}
}