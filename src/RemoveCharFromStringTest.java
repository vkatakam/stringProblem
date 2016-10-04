import org.testng.annotations.Test;

public class RemoveCharFromStringTest {

	RemoveCharFromSring rm = new RemoveCharFromSring();

	@Test
	public void removeAllChars() {
		System.out.println("----------Start of removeAllChars-Test----------");
		String str = "babbpbbbpbbbblbbbbbetest";
		String charToRemove = "b";
		String result = rm.removeAllChars(str, charToRemove);
		System.out.println("Input String: " + str);
		System.out.println("Char to Remove: " + charToRemove);
		System.out.println("Result: " + result);
		System.out.println("----------End of removeAllChars-Test----------");

	}

	@Test
	public void removeCharIterate() {
		System.out
				.println("----------Start of removeCharIterate-Test----------");
		String str = "babbpbbbpbbbblbbbbbetest";
		char ch = 'b';
		String result = rm.removeCharsIterate(str, ch);
		System.out.println("Input String: " + str);
		System.out.println("Char to Remove: " + ch);
		System.out.println("Result: " + result);
		System.out.println("----------End of removeCharIterate-Test----------");

	}

	// Negative testcases

	@Test
	public void removeCharEmpty() {
		System.out.println("----------Start of removeCharEmpty-Test----------");
		String str = "babbpbbbpbbbblbbbbbetest";
		char ch = ' ';
		rm.checkEmptyString(str, ch);
		System.out.println("Input String: " + str);
		System.out.println("Char to Remove: " + ch);
		System.out.println("----------End of removeCharEmpty-Test----------");

	}

	@Test
	public void emptyString() {
		System.out.println("----------Start of emptyString-Test----------");
		String str = "";
		char ch = 'b';
		rm.checkEmptyString(str, ch);
		System.out.println("Input String: " + str);
		System.out.println("Char to Remove: " + ch);
		System.out.println("----------End of emptyString-Test----------");

	}

	@Test
	public void checkNull() {
		System.out.println("----------Start of emptyString-Test----------");
		String str = null;
		char ch = 'b';
		rm.checkEmptyString(str, ch);
		System.out.println("Input String: " + str);
		System.out.println("Char to Remove: " + ch);
		System.out.println("----------End of emptyString-Test----------");

	}

}
