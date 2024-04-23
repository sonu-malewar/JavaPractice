package JavaPractice;

public class LargestSubString {

	public static void findLargestsubString(String s) {

		String[] sp = s.split(" ");
		// String max = sp[0];
		String temp = null;
		for (int i = 0; i < sp.length; i++) {
			for (int j = 1; j < sp.length-2; j++) {

				if (sp[i].length() > sp[i + 1].length()) {

					temp = sp[i];

					sp[i] = sp[j];

				sp[i] = temp;

				}

			}
		}
		System.out.println(temp);

	}

	public static void main(String[] args) {
		String str = "sonu is a selenium tester fantastic";
		findLargestsubString(str);

	}

}
