

import static org.junit.Assert.*;

import org.junit.Test;

public class ModulusTests {

	 Operations o = new Operations() ;

	   @Test
	   public void test_modulus1() {
	      System.out.println("Test 1 if modulus works...") ;
	      assertTrue(o.modulus(27, 12) == 3.0) ;
	   }

	   @Test
	   public void test_modulus2() {
	      System.out.println("Test 2 if modulus works...") ;
	      assertTrue(o.modulus(11, .06) == 0.020) ;
	   }
	   
	   @Test
	   public void test_modulus3() {
	      System.out.println("Test 3 if modulus works...") ;
	      assertTrue(o.modulus(-23,  2.5) == -.500) ;
	   }
	   
	   @Test
	   public void test_modulus4() {
	      System.out.println("Test 4 if modulus works...") ;
	      assertTrue(o.modulus(11, 4) == 3.0) ;
	   }
	   
	}







