package Act_47_al_53;

import java.util.Arrays;

public class Act_50 {
	public static void main(String[] args) {
	int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
    for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = temp;
    }
    System.out.println("L'array invertida és: " + Arrays.toString(array));
}
}