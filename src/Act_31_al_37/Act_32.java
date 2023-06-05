package Act_31_al_37;

public class Act_32 {
	public static void main(String[] args) {
		String str = "Hola, món!";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) == 'a') {
		        count++;
		    }
		}

		System.out.println("La String té " + count + " 'a'.");
	}
}
