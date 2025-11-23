import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class L2023111424_10_Test {
    
    private Solution10 solution = new Solution10();
    
  
    @Test
    void testCase1() {
        String expression = "-1/2+1/2";
        String expected = "0/1";
        assertEquals(expected, solution.fractionAddition(expression));
    }
    
   
    @Test
    void testCase2() {
        String expression = "-1/2+1/2+1/3";
        String expected = "1/3";
        assertEquals(expected, solution.fractionAddition(expression));
    }
    
   
    @Test
    void testCase3() {
        String expression = "1/3-1/2";
        String expected = "-1/6";
        assertEquals(expected, solution.fractionAddition(expression));
    }
    
   
    @Test
    void testComplexOperation() {
        String expression = "1/2-1/3+1/4";
        String expected = "5/12";
        assertEquals(expected, solution.fractionAddition(expression));
    }
    
    
    @Test
    void testIntegerFractionMixed() {
        String expression = "3+1/2-2/3";
        String expected = "17/6";
        assertEquals(expected, solution.fractionAddition(expression));
    }
    
   
    @Test
    void testAllNegative() {
        String expression = "-1/3-1/4-1/5";
        String expected = "-47/60";
        assertEquals(expected, solution.fractionAddition(expression));
    }
    
   
    @Test
    void testResultIsInteger() {
        String expression = "1/2+1/2+2/1";
        String expected = "3/1";
        assertEquals(expected, solution.fractionAddition(expression));
    }
    
    
    @Test
    void testSingleFraction() {
        String expression = "5/3";
        String expected = "5/3";
        assertEquals(expected, solution.fractionAddition(expression));
    }
    
   
    @Test
    void testGcdReduction() {
        String expression = "2/4+3/6";
        String expected = "1/1";
        assertEquals(expected, solution.fractionAddition(expression));
    }
}