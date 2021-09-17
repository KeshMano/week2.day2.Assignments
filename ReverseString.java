package week2.Assignments;

public class ReverseString {

	public static void main(String[] args) {
		// Here is the input
		String str = "Hardwork";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		int length = str.length();
		for (int j = length - 1; j >= 0; j--) {
			System.out.println(ch[j]);
		}
		System.out.println(ch[5]);

		

	}

}
