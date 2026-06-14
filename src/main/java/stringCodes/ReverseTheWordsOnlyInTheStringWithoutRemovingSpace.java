package stringCodes;

public class ReverseTheWordsOnlyInTheStringWithoutRemovingSpace {
	
	public static void main(String[] args) {
		 
		String str = "My name is prashant";
		
		
		// FIRST WAY
		String revWords [] = str.split(" ");
		
		for(int i=0;i<revWords.length;i++)
		{
			
			StringBuilder s = new StringBuilder(revWords[i]).reverse();
			revWords[i] = s.toString();
			System.out.print(revWords[i]+" ");
		}
		System.out.println();
		
		
		 System.out.println(String.join(" ", revWords));
		 
		 // SECOND WAY
		  String[] words2 = str.split(" ");
	        StringBuffer result2 = new StringBuffer();

	        for (String word : words2) {
	            result2.append(new StringBuilder(word).reverse()).append(" ");
	        }

	        System.out.println(result2.toString());    // trim to remove trailing space
	        
	        //THIRD WAY 
	        
	     // TRY WITHOUT FUNCTION --------------------------------------------------
			// TECHNICALLY NOT RIGHT IF YOU DONT USE REV2
			// WORK IF YOU REMOVE LINE 24, 32, 34, 35 BUT TECHNICALLY WRONG
			// BECAUSE YOU HAVE LAST STORED WORD ONLY LEFT IS SDROW
			String str2 = "This are my words";
			String[] s = str2.split(" ");
			String rev = "";
			// String rev2 = "";
			for (int i = 0; i < s.length; i++) {
				rev = "";
				for (int j = s[i].length() - 1; j >= 0; j--) {
					rev = rev + s[i].charAt(j);

				}
				System.out.print(rev + " ");
				// rev2 = rev2 + " " + rev;
			}
//			System.out.println();
//			System.out.println("Stored " + rev2 + " ");
	        
	        
		 
	}

}
