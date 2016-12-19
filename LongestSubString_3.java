import java.util.HashSet;
import java.util.Set;

public class LongestSubString_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		int result = FindMax(s);
		int result1 = OptimalFindMax(s);
		System.out.println(result1);
		System.out.println(result);

	}

	private static int OptimalFindMax(String s) {
		int ret = 0, i = 0, j = 0;
		int n = s.length();
		Set<Character> set = new HashSet<>();
		while(i<n && j< n) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ret = (int) Math.max(ret, j-i);
			}
			else {
				set.remove(s.charAt(i++));
			}
		}
		
		return ret;
	}

	private static int FindMax(String s) {
		int count = 0;
		for(int i = 0;i < s.length();i++) {
			for(int j = 1;j <= s.length()-i;j++) {
				if((isRepeating(s.substring(i, i+j)))) {
					count = s.substring(i,i+j).length() > count ? s.substring(i,i+j).length() : count;
				}
			}
		}
		return count;
	}

	private static boolean isRepeating(String substring) {
		// TODO Auto-generated method stub
	     boolean[] char_set = new boolean[256];

	     //iterate through the string we are testing
	     for (int i = 0; i < substring.length(); i++) {

	         // Get the numerical (ascii) value of the character in the `str` at position `i`.
	         int val = substring.charAt(i);

	         // If char_set[val] has been set, that means that this character was already present in the string. (so in string 'hello' this would be true for the second 'l')
	         if (char_set[val]) {
	             return false;
	         }
	         // If the character hasn't been encountered yet (otherwise we would have returned true above), then mark this particular character as present in the string
	         char_set[val] = true;
	     }
	     // If the function hasn't returned false after going through the entire string that means that each character is unique - thus returning true
	     return true;
	}

}
