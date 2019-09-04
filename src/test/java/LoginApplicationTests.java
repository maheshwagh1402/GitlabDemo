import static org.junit.Assert.*;

import org.junit.Test;

import abc.CreatingAccount;

import abc.Pallindrome;

import abc.Calculator;



public class LoginApplicationTests {

	@Test
    public void testLoginPage() {
        beginAt("login.jsp"); 
        assertTitleEquals("Login");
        assertLinkPresent("Succes");
        clickLink("Succes");
        assertTitleEquals("Succes");
    }
    
    @Test
    public void testIndexPage() {
        beginAt("login.jsp"); 
        assertTitleEquals("Login");
        assertLinkPresent("Error");
        clickLink("Error");
        assertTitleEquals("Error");
    }
    
   
    @Test
      public  void testInsertAccount()
      {
      CreatingAccount ca = new CreatingAccount();
      ca.createAccount("TestclassAcc1");
      
      }
      
      
       @Test
    public void testAddition() {
      Calculator calc = new Calculator();
      // 3 + 4 = 7
      int expected = 7;
      int actual = calc.add(3, 4);
      assertEquals("adding 3 and 4", expected, actual);
    }
    
    @Test
    public void testDivision() {
      Calculator calc = new Calculator();
      int expected = 2;
      int actual = calc.substract(2,0);
      assertEquals("adding 3 and 4", expected, actual);
    }
    
    
      public void testAdditionw() {
        Calculator calc = new Calculator();
        // 3 + 4 = 7
        int expected = 7;
        int actual = calc.add(3, 4);
        assertEquals("adding 3 and 4", expected, actual);
      }
      
      
        @Test
    public void testMul() {
      Calculator calc = new Calculator();
      int expected = 4;
      int actual = calc.mul(2,2);
      assertEquals("adding 3 and 4", expected, actual);
    }
    
    
    @Test
    public void testMull() {
      Calculator calc = new Calculator();
      int expected = 4;
      int actual = calc.mul(2,2);
      assertEquals("adding 3 and 4", expected, actual);
    }
   
    private void clickLink(String string) {
                    // TODO Auto-generated method stub
                    
    }
    private void assertTitleEquals(String string) {
                    // TODO Auto-generated method stub
                    
    }
    private void beginAt(String string) {
                    // TODO Auto-generated method stub
                    
    }
    private void assertLinkPresent(String string) {
                    // TODO Auto-generated method stub
                    
    }
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
