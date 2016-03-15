

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTests {

	 Operations o = new Operations() ;

	   @Test
	   public void test_division1() {
	      System.out.println("Test 1 if division works...") ;
	      assertTrue(o.division(27, 12) == 2.25) ;
	   }

	   @Test
	   public void test_division2() {
	      System.out.println("Test 2 if division works...") ;
	      assertTrue(o.division(11, .04) == 275) ;
	   }
	   
	   @Test
	   public void test_division3() {
	      System.out.println("Test 3 if division works...") ;
	      assertTrue(o.division(-23,  2.5) == -9.2) ;
	   }
	   
	   @Test
	   public void test_division4() {
	      System.out.println("Test 4 if division works...") ;
	      assertTrue(o.division(3, 4) == .75) ;
	   }
	   
	}



