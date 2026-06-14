package stringCodes;

public class FrequencyOfEveryCharacterInString {

	public static void main(String[] args) {

	//	String str = "my name is prashant and i am good";
		String str = "dnndsff sdfsf ffd  fffdf";

		char array[] = str.toCharArray();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (array[i] != ' ') {
				count = 1;
				for (int j = i + 1; j < str.length() - 1; j++) {
					if (array[i] == array[j] && array[i] != ' ') {
						count++;
						array[j] = ' ';
					}
					
					
				}
				System.out.println("Frequency of " + array[i] + " is " + count);
			}
		}

	}

}
