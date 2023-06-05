package Act_31_al_37;

public class Act_35 {
	public static void main(String[] args) {
		String str = "abcbcbcb";
		int countB = 0;
		int countC = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'b') {
				countB++;
			} else if (str.charAt(i) == 'c') {
				countC++;
			}
		}

		if (countB > countC) {
			System.out.println("La String té més caràcters 'b' que 'c'.");
		} else if (countB < countC) {
			System.out.println("La String té més caràcters 'c' que 'b'.");
		} else {
			System.out.println("La String té el mateix nombre de caràcters 'b' i 'c'.");
		}
	}
}