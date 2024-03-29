package core;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class PrimeNumberCheckerTest {
   private PrimeNumberChecker pn;

   @Before
   public void initialize() {
       pn = new PrimeNumberChecker();
   }

   @Parameter(value = 0)
   public Integer inputNumber;

   @Parameter(value = 1)
   public Boolean expectedResult;

   @Parameters(name = "Iteration # {index}: Number: {0}; isPrime? {1}")

   public static Collection<Object[]> primeNumbers() {
      Object[][] data = new Object[][] {
    		/*  { 1, true },
    		  { 2, true },
    		  { 6, false },
    		  { 19, true },
    		  { 22, false }
    		  { 1, true },
    		  { 2, true },
    		  { 3, true },
    		  { 4, true },
    		  { 5, true },
    		  { 6, true },
    		  { 7, true },
    		  { 8, true },
    		  { 9, true },
    		  { 10, true},
    		  { 11, true },
    		  { 12, true },
    		  { 13, true },
    		  { 14, true },
    		  { 15, true },
    		  { 16, true },
    		  { 17, true },
    		  { 18, true },
    		  { 19, true },
    		  { 20, true },
    		  { 21, true },
    		  { 22, true },
    		  { 23, true },													
    		  { 24, true },
    		  { 25, true },
    		  { 26, true },
    		  { 27, true },
    		  { 28, true },
    		  { 29, true },
    		  { 30, true },
    		  { 31, true },
    		  { 32, true },
    		  { 33, true },
    		  { 34, true },
    		  { 35, true },
    		  { 36, true },
    		  { 37, true },
    		  { 38, true },
    		  { 39, true },
    		  { 40, true },
    		  { 41, true },
    		  { 42, true },
    		  { 43, true },
    		  { 44, true },
    		  { 45, true },
    		  { 46, true },
    		  { 47, true },
    		  { 48, true },
    		  { 49, true },
    		  { 50, true },
    		  { 51, true },
    		  { 52, true },
    		  { 53, true },
    		  { 54, true },
    		  { 55, true },
    		  { 56, true },
    		  { 57, true },
    		  { 58, true },
    		  { 59, true },
    		  { 60, true },
    		  { 61, true },
    		  { 62, true },
    		  { 63, true },
    		  { 64, true },
    		  { 65, true },
    		  { 66, true },
    		  { 67, true },
    		  { 68, true },
    		  { 69, true },
    		  { 70, true },
    		  { 71, true },
    		  { 72, true },
    		  { 73, true },
    		  { 74, true },
    		  { 75, true },
    		  { 76, true },
    		  { 77, true },
    		  { 78, true },
    		  { 79, true },
    		  { 80, true },
    		  { 81, true },
    		  { 82, true },
    		  { 83, true },
    		  { 84, true },
    		  { 85, true },
    		  { 86, true },
    		  { 87, true },
    		  { 88, true },
    		  { 89, true },
    		  { 90, true },
    		  { 91, true },
    		  { 92, true },
    		  { 93, true },
    		  { 94, true },
    		  { 95, true },
    		  { 96, true },
    		  { 97, true },
    		  { 98, true },
    		  { 99, true },
    		  { 100, true }*/


    		  { 1, true },
              { 2, true },
              { 3, true },
              { 4, true },
              { 5, true },
              { 6, false },
              { 7, true },
              { 8, false },
              { 9, false },
              { 10, false},
              { 11, true },
              { 12, false },
              { 13, true },
              { 14, false },
              { 15, false },
              { 16, false },
              { 17, true },
              { 18, false },
              { 19, true },
              { 20, false },
              { 21, false },
              { 22, false },
              { 23, true },													
              { 24, false },
              { 25, false },
              { 26, false },
              { 27, false },
              { 28, false },
              { 29, true },
              { 30, false },
              { 31, true },
              { 32, false },
              { 33, false },
              { 34, false },
              { 35, false },
              { 36, false },
              { 37, true },
              { 38, false },
              { 39, false },
              { 40, false },
              { 41, true },
              { 42, false },
              { 43, true },
              { 44, false },
              { 45, false },
              { 46, false },
              { 47, true },
              { 48, false },
              { 49, false },
              { 50, false },
              { 51, false },
              { 52, false },
              { 53, true },
              { 54, false },
              { 55, false },
              { 56, false },
              { 57, false },
              { 58, false },
              { 59, true },
              { 60, false },
              { 61, true },
              { 62, false },
              { 63, false },
              { 64, false },
              { 65, false },
              { 66, false },
              { 67, true },
              { 68, false },
              { 69, false },
              { 70, false },
              { 71, true },
              { 72, false },
              { 73, true },
              { 74, false },
              { 75, false },
              { 76, false },
              { 77, false },
              { 78, false },
              { 79, true },
              { 80, false },
              { 81, false },
              { 82, false },
              { 83, true },
              { 84, false },
              { 85, false },
              { 86, false },
              { 87, false },
              { 88, false },
              { 89, true },
              { 90, false },
              { 91, false },
              { 92, false },
              { 93, false },
              { 94, false },
              { 95, false },
              { 96, false },
              { 97, true },
              { 98, false },
              { 99, false },
             { 100, false }
    	};
     return Arrays.asList(data);
   }

   @Test
   public void testPrimeNumberChecker() {
   System.out.println("Is " + inputNumber + " a prime number? - " + expectedResult);
   assertEquals(expectedResult, pn.validate(inputNumber));
   }
}
