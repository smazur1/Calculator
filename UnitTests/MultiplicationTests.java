
import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTests {

	 Operations o = new Operations() ;

	   @Test
	   public void test_multiplication1() {
	      System.out.println("Test 1 if multiplication works...") ;
	      assertTrue(o.multiplication(12, 27.3) == 327.6) ;
	   }

	   @Test
	   public void test_multiplication2() {
	      System.out.println("Test 2 if multiplication works...") ;
	      assertTrue(o.multiplication(.03, 11) == .330) ;
	   }
	   
	   @Test
	   public void test_multiplication3() {
	      System.out.println("Test 3 if multiplication works...") ;
	      assertTrue(o.multiplication(-1.45,  17.23) == -24.9835) ;
	   }
	   
	   @Test
	   public void test_multiplication4() {
	      System.out.println("Test 4 if multiplication works...") ;
	      assertTrue(o.multiplication(3, 4) == 12.0) ;
	   }
	   
	}


