import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractionTests {

	 Operations o = new Operations() ;

	   @Test
	   public void test_subtraction1() {
	      System.out.println("Test 1 if subtraction works...") ;
	      assertTrue(o.subtraction(12, 27.3) == -15.3) ;
	   }

	   @Test
	   public void test_subtraction2() {
	      System.out.println("Test 2 if subtraction works...") ;
	      assertTrue(o.subtraction(.03, 11) == -10.97) ;
	   }
	   
	   @Test
	   public void test_subtraction3() {
	      System.out.println("Test 3 if subtraction works...") ;
	      assertTrue(o.subtraction(-1.45,  17.23) == -18.68) ;
	   }
	   
	   @Test
	   public void test_subtraction4() {
	      System.out.println("Test 4 if subtraction works...") ;
	      assertTrue(o.subtraction(13, 4) == 9.0) ;
	   }
	   
	}

