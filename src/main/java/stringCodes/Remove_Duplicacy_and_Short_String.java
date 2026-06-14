package stringCodes;

import java.util.Set;
import java.util.TreeSet;

public class Remove_Duplicacy_and_Short_String {

	public static void main(String[] args) {
		String str = "zxcvbnmnmbvcxzzxcvbnm";

		// TRY WITH COLLECTION CLASS TREESET ---------------------
		Set<Character> set = new TreeSet<>();
		for (char c : str.toCharArray()) {
			set.add(c);
		}
		System.out.println(set);

		// TRY IT WITHOUT ANY FUNCTION ----------------------------

		String str1 = "hiewhfiowekwuyjgwerkujewmr";
		String strSolved = "";
		char a[] = str1.toCharArray();
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j < str1.length(); j++) { // AVOID MISTAKE j=1 it will make common
				if (a[i] == a[j]) { // values after second iteration
					a[j] = '*';
				}
				if (a[i] > a[j] && a[i] != '*') {
					char temp = 0;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

			if (a[i] != '*') {
				System.out.print(a[i]); // below code work same but this decrease 1 loop means time compl.
			}
		}
//		int i = 0;
//		while (i < str1.length()) {
//			if (a[i] != '*') {
//				strSolved = strSolved + a[i];
//			}
//			i++;
//		}
//		System.out.println(strSolved);

		// TRY WITH ANOTHER CLASS OF COLLECTION

	}
}
