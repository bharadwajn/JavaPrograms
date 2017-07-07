import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Third_Maximum_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2};
		int result = thirdMaxim(arr);
		System.out.println(result);

	}

	private static int thirdMaxim(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();//To avoid duplicates
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());//creating a heap
		for(int i = 0; i < arr.length; i++) {
			if(!set.contains(arr[i])) {
				heap.add(arr[i]);
			}
			set.add(arr[i]);
		}

		int i = 3;//To get the only the first three numbers
		int max = heap.peek();
		if(heap.size()<3) {
			return max;
		}
		while(i--!=0) {
			max = heap.poll();
		}
		return max;
	}

}
