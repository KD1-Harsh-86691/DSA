package Assignment6;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		Min_Heap minHeap = new Min_Heap();
		
		int[] arr = {13,2,10,15,6,8,3};
		
		String s = Arrays.toString(minHeap.heap(arr));
		System.out.println(s);
	}
}
