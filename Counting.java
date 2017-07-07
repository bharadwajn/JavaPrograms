import java.awt.List;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,1,2,2,3,4,4,5,7,8,8,8,8,8,8};
		count_occurance(arr);
	}

	private static void count_occurance(int[] arr) {
		// TODO Auto-generated method stub
		int Number=0;
		int count=0, occurance=0;
		for(int i=0; i<arr.length -1;){
			int temp;
			temp = arr[i];
			while(arr[i] == temp){
				count++;
				if(i<arr.length-1){
					i++;
				}
				if(i == arr.length - 1) {
					if(arr[i] == temp) count++;
					break;
				}

			}
			if(count>occurance){
				occurance=count;
				Number = temp;
			}
			count = 0;
		}
		System.out.println(occurance);

	}

}
