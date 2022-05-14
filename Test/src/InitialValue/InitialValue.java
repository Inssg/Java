package InitialValue;

import java.util.Arrays;

public class InitialValue {
	public static void main(String[] args) {
		
		int value1;
		
		int[] value2 ;
	
		boolean[] array1 = new boolean[3];
		for(int i = 0; i < 3; i++) {
			System.out.println(array1[i] + " ");
		}
		System.out.println();
		
		int[] array2 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println(array2[i] + " ");
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
