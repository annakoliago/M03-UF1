package Act_47_al_53;

public class Act_48 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("La suma dels valors de l'array és: " + suma);
    }
}