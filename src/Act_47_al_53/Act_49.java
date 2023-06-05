package Act_47_al_53;

import java.util.Arrays;

public class Act_49 {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	        int ultimValor = array[array.length - 1];
	        for (int i = array.length - 1; i > 0; i--) {
	            array[i] = array[i - 1];
	        }
	        array[0] = ultimValor;
	        System.out.println("L'array després de moure els valors és: " + Arrays.toString(array));
	    }
	}