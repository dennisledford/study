/**
 * 
 */
package examples;

import org.junit.Assert;

import org.junit.Test;

/**
 * @author dennis
 *
 */
public class Palindrome {

	/**
	 * does not use String
	 * @param number
	 * @return if number is palindrome
	 */
	public boolean isPalindrome(Long number){
		if(number.equals(reverseNumber(number))){
			return true;
		}
		return false;
	}

	private Long reverseNumber(Long number){
		Long reverse=0L;
		while(number>0){
			Long lastDigit = number%10;
			number = number/10;
			reverse = reverse*10 + lastDigit;
		}
		return reverse;
	}
	
	/**
	 * 
	 * @param str
	 * @return if string is palindrome
	 */
	public boolean isPalindrome(String str){
		String reverse = new StringBuilder(str).reverse().toString();
		if(reverse.equals(str)){
			return true;
		}
		
		return false;
	}
	
	
	@Test
	public void testPalindromes(){
		Assert.assertTrue(isPalindrome(1001L));
		//how i would do this @work
		Assert.assertTrue(isPalindrome(String.valueOf(1001L)));
	}
}
