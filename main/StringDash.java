import org.apache.commons.lang3.StringUtils;

/**
 * Write a function with unit tests that takes a string as an input
 * and returns that string but with a "-" in between each character.
 * 
 * Requires commons-lang3-3.4.jar in the path.
 * 
 * @author Heather
 */

public class StringDash {

	public static void main(String[] args) {
        String plainString = "ABCDEFG";
        System.out.println("Original String: " + plainString);
        String dashedString = insertDashes(plainString);
        System.out.println("Dashed String: " + dashedString);
	}
	
    public static String insertDashes(String plainString) {
    	char[] splitString = plainString.toCharArray();
        return StringUtils.join(splitString, '-');
    }

}
