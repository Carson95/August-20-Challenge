import java.util.Scanner;

public class WordFunnel {
	
	
	private static String firstWord;
	private static String secondWord;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first word: ");
		firstWord = scan.next();
		System.out.println("Enter the second word: ");
		secondWord = scan.next();
		System.out.println(isFunnel(firstWord, secondWord) ? "True!" : "False!");
	}
	
	private static boolean isFunnel(String first, String second) {
		
		int count = first.length() - 1;
		int index = 0;
		do {
			StringBuilder firstString = new StringBuilder(first);
			if (firstString.deleteCharAt(index).toString().equals(second)) {
				return true;
			}
			index++;
		} while(index != count);
		
		return false;
	}

}
