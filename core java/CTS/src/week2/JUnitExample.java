package week2;

//File: JUnitExample.java

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;

public class JUnitExample {

 // Main Class with Business Logic
 public static class Calculator {
     public int add(int a, int b) {
         return a + b;
     }
 }

 // Test Class
 public static class CalculatorTest {

     @Test
     public void testAdd() {
         Calculator c = new Calculator();
         int result = c.add(10, 5);
         assertEquals(15, result);
     }
 }

 // Main Method to Run the Test
 public static void main(String[] args) {
     Result result = JUnitCore.runClasses(CalculatorTest.class);

     for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
     }

     if (result.wasSuccessful()) {
         System.out.println("All tests passed.");
     } else {
         System.out.println("Some tests failed.");
     }
 }
}
