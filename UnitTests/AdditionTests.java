import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTests {

	 Operations o = new Operations() ;

	   @Test
	   public void test_addition1() {
	      System.out.println("Test 1 if addition works...") ;
	      assertTrue(o.addition(12, 27.3) == 39.3) ;
	   }

	   @Test
	   public void test_addition2() {
	      System.out.println("Test 2 if addition works...") ;
	      assertTrue(o.addition(.03, 11) == 11.03) ;
	   }
	   
	   @Test
	   public void test_addition3() {
	      System.out.println("Test 3 if addition works...") ;
	      assertTrue(o.addition(-1.45,  17.23) == 15.78) ;
	   }
	   
	   @Test
	   public void test_addition4() {
	      System.out.println("Test 4 if addition works...") ;
	      assertTrue(o.addition(3, 4) == 7.0) ;
	   }
	   
	}

