public class RemoveCharFromSring {

	public String removeAllChars(String str, String charToRemove) {
		return str.replaceAll(charToRemove, "");

	}

	public String removeCharsIterate(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				str = str.replace(str.charAt(i), ' ');
				// System.out.println("Char FOUND" +str);
			}
			str = str.replaceAll(" ", "");
			// System.out.println(str);
		}

		return str;
	}
	
	public boolean checkEmptyString(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if ((str == null) || (str.isEmpty())) {
				System.out.println("Given String is empty or null");
				return false;				
			}
			if (str.charAt(i) == ch) {
				str = str.replace(str.charAt(i), ' ');
				// System.out.println("Char FOUND" +str);
			}
			str = str.replaceAll(" ", "");
			// System.out.println(str);
			
		}

		return true;
	}

}
