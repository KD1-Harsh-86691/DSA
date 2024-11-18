package Assignment6;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        Max_Heap maxHeap = new Max_Heap();
        
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        
        int[] sortedArr = maxHeap.heap(arr);
        
        System.out.println("Sorted array (Max Heap Priority Queue): " + Arrays.toString(sortedArr));
    }
}
