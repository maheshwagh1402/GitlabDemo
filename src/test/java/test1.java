import static org.junit.Assert.*;

import org.junit.Test;

import abc.Pallindrome;

public class test1 {

	@Test
	public void whenEmptyString_thenAccept() {
	    Pallindrome palindromeTester = new Pallindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
	
	
	@Test
	public void whenPalindrom_thenAccept() {
	    Pallindrome palindromeTester = new Pallindrome();
	    assertTrue(palindromeTester.isPalindrome("noon"));
	}
	     
	@Test
	public void whenNearPalindrom_thanReject(){
	    Pallindrome palindromeTester = new Pallindrome();
	    assertFalse(palindromeTester.isPalindrome("neon"));
	}
}
