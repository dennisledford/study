/**
 * 
 */
package examples;

import org.junit.*;

/**
 * @author dennisledford
 *
 */
public class ReverseString {

	
	
	public String reverse(String forward){
		StringBuilder reverse = new StringBuilder(forward);
		return reverse.reverse().toString();
	}
	
	
	/**
	 * Standard loop way
	 * @param forward
	 * @return forward but reversed
	 */
	public String reverseIt(String forward){
		
		StringBuilder reverse= new StringBuilder();
		for(int i=forward.length()-1; i>=0; i--){
			reverse.append(forward.charAt(i));
		}
		
		return reverse.toString();
		
	}
	
	/**
	 * easy use of recursion
	 * @param forward
	 * @return forward but reversed
	 */
	public String recursiveReverse(String forward){
		while(forward.length()>1){
			return recursiveReverse(forward.substring(1)) + forward.charAt(0);
		}
		return forward;
	}
	
	
	
	@Test
	public void testReverseIt(){
		String testString = "dennis";
		String reverseString = reverseIt(testString);
		Assert.assertEquals("sinned",reverseString);
	}
	
	
	@Test
	public void testRecursiveReverse(){
		String testString = "supercalifragilisticexpialidocious";
		System.out.println(recursiveReverse(testString));
	}
}
