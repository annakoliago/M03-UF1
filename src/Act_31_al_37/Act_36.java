package Act_31_al_37;

public class Act_36 {
		public static void main(String[] args) {
			String str = "L'alcalde va anunciar la seva dimissió perquè no li agradava la nova llei.";
			int count = 0;
			int posicio = str.indexOf("LA");

			while (posicio != -1) {
				count++;
				posicio = str.indexOf("LA", posicio + 1);
			}

			System.out.println("Hi ha " + count + " ocurrencies de 'LA'.");
		}
	}