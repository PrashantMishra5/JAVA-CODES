package stringCodes;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String str = "My name is prashant";
		
		// FIRST WAY
		String strRev = "";
		for(int i=0;i<str.length();i++)
		{
			strRev = str.charAt(i)+strRev;
		}
		
		System.out.println(strRev);
		
		// SECOND WAY
		
		String strRev2 = "";
		StringBuffer s = new StringBuffer(str);
		strRev2 =s.reverse().toString();
		System.out.println(strRev2);
		
		//THIRD WAY
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
		
		//FORTH WAY
		
		int j=str.length()-1;
		char[] a = new char[str.length()];
		int i=0;
		while(j>=0)
		{
			a[i]= str.charAt(j);
			j--;i++;
		}
		System.out.println(a);
		
		
		// FIFTH WAY
		char[] chars = str.toCharArray();
		int left = 0;
		int right = chars.length - 1;

		while (left < right) {
		    // swap left and right characters
		    char temp = chars[left];
		    chars[left] = chars[right];
		    chars[right] = temp;
		    left++;
		    right--;
		}

		System.out.println(new String(chars));
		
		
		// SIXTH WAY

		String reversed = str.chars()
		    .mapToObj(c -> String.valueOf((char) c))
		    .reduce("", (x, y) -> y + x);
		System.out.println(reversed);
		
	}
	/*
	 ╔═══╦══════════════════════╦═════════════╦══════════╦══════════════════╗
	 ║Way║ Method               ║ Thread Safe ║  Speed   ║ Interview Value  ║
	 ╠═══╬══════════════════════╬═════════════╬══════════╬══════════════════╣
	 ║ 1 ║ Prepend in loop      ║     No      ║  Slow    ║      Low         ║
	 ║ 2 ║ StringBuffer         ║     Yes     ║  Medium  ║      Medium      ║
	 ║ 3 ║ StringBuilder        ║     No      ║  Fast    ║    ★ High        ║
	 ║ 4 ║ char array           ║     No      ║  Fast    ║      Medium      ║
	 ║ 5 ║ Two pointer swap     ║     No      ║ ★Fastest ║   ★★ Highest    ║
	 ║ 6 ║ Streams (Java 8+)    ║     No      ║  Medium  ║    ★ High        ║
	 ╚═══╩══════════════════════╩═════════════╩══════════╩══════════════════╝
	 */
	
	
	
	
//	ONE THING TO ADD TO YOUR CODE
//	AT THE TOP OF YOUR CLASS, YOUR VARIABLE I IS DECLARED INSIDE THE FOR LOOP BUT THEN YOU REDECLARE INT I=0 FOR THE WHILE LOOP — THIS ACTUALLY CAUSES A COMPILE ERROR IN SOME IDES BECAUSE I FROM THE FOR LOOP SCOPE MAY CONFLICT. CLEAN FIX:
//	JAVA// RENAME THE WHILE LOOP COUNTER TO AVOID CONFUSION
//	INT J = STR.LENGTH() - 1;
//	INT K = 0;                    // USE K INSTEAD OF I
//	CHAR[] A = NEW CHAR[STR.LENGTH()];
//	WHILE (J >= 0) {
//	    A[K] = STR.CHARAT(J);
//	    J--; K++;
//	}
	}
