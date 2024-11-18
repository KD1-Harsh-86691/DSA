package Assignment6;

public class Min_Heap {
	void swap(int[]arr,int a , int b) {
		int temp = arr[a]; 
		arr[a]=arr[b];
		arr[b]=temp;
		
	}
	
	void heapify(int[] arr ,int n ,int i) {
		int smallest = i;
		int left = 2*i + 1;
		int right = 2*i +2;
		
		if(left<n && arr[smallest]>arr[left]) {
			smallest = left;
		}
		
		if(right<n && arr[smallest]>arr[right]) {
			smallest = right;
		}
		
		if(smallest!=i) {
			swap(arr,smallest,i);
			heapify(arr ,n,smallest);
		}
		
	}
	
public int[] heap(int[] arr) {
		
		int n = arr.length;
		
		for(int i = n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>0;i--) {
			swap(arr,i,0);
			heapify(arr,i,0);
		}
		return arr;
	}
}
