package Act_21_al_30;

public class Act_25 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
			count++;
		}
		System.out.println("Hi ha " + count + " nombres imparells fins al 100.");
	}
}