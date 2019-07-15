import java.util.Arrays;

public class SampleTest {
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("build", "sdibu"));
	}
	
	
	public static String isAnagram(String firstWord, String secondWord) {
	     char[] charArray1 = firstWord.replaceAll("[\\s]", "").toCharArray();
	     char[] charArray2 = secondWord.replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(charArray1);
	     Arrays.sort(charArray2);
	     return Arrays.equals(charArray1, charArray2) == true ? "yes":"no";
	}

}
