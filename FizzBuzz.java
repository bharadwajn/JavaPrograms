import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> result = getResult(n);
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}

	}

	private static List<String> getResult(int n) {
		List<String> toReturn = new ArrayList<>();
		for(int i=1;i<=n-1;i++) {
			if(i%15==0) {
				toReturn.add("FizzBuzz, ");
			}
			else if(i%5==0) {
				toReturn.add("Buzz, ");
			}
			else if(i%3==0) {
				toReturn.add("Fizz, ");
			}
			else {
				toReturn.add(Integer.toString(i)+",");
			}
		}
		int j =n;
		if(j%15==0) {
			toReturn.add("FizzBuzz");
		}
		else if(j%5==0) {
			toReturn.add("Buzz");
		}
		else if(j%3==0) {
			toReturn.add("Fizz");
		}
		else {
			toReturn.add(Integer.toString(j));
		}
		return toReturn;
	}

}
