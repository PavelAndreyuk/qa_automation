import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
    @DataProvider
    public Object[][] testEqualsPositiveSum() {
        return new Object[][]{
                {0, -1, 1},
                {-10, -7, -3},
                {10, 7, 3},
                {5.5, 2.3, 3.2}
        };
    }

    @DataProvider
    public Object[][] testEqualsNegativeSum() {
        return new Object[][]{
                {0, -1, -1},
                {-10, 10, 0},
                {11, 7, 3},
                {4.5, -5.5, 1},
        };
    }

    @DataProvider
    public Object[][] testEqualsPositiveSub() {
        return new Object[][]{
                {1, 1, 0},
                {-10, -7, 3},
                {10, 13, 3},
                {-5.5, -6.5, -1}
        };
    }

    @DataProvider
    public Object[][] testEqualsNegativeSub() {
        return new Object[][]{
                {-1, 0, -1},
                {10, 7, 3},
                {-11, -7, -3},
                {5, 4.5, 0.5}
        };
    }

    @DataProvider
    public Object[][] testEqualsPositiveMult() {
        return new Object[][]{
                {0, 1, 0},
                {6, 3, 2},
                {-10, -5, 2},
                {25.98, 4.33, 6}
        };
    }

    @DataProvider
    public Object[][] testEqualsNegativeMult() {
        return new Object[][]{
                {-1, 1, 1},
                {4, 3, 3},
                {-10, -2, -5},
                {10.1, 101, 0.1}
        };
    }

    @DataProvider
    public Object[][] testEqualsPositiveDiv() {
        return new Object[][]{
                {10, 100, 10},
                {1, -10, -10},
                {5.75, 11.5, 2},
        };
    }

    @DataProvider
    public Object[][] testEqualsNegativeDiv() {
        return new Object[][]{
                {7, 10, 2},
                {-9, -18, -1},
                {54.56, 100.11, 2.74}
        };
    }

    @DataProvider
    public Object[][] testNumberFormatException() {
        return new Object[][]{
                {1, 1, "a"},
                {1, "", 1},
                {1, 1, "@!#$*&"}
        };
    }

    @DataProvider
    public Object[][] testArithmeticException() {
        return new Object[][]{
                {1, 1, 0}
        };
    }

    @Test(dataProvider = "testEqualsPositiveSum")
    public void testEqualsPositiveSum(double expected, double firstNumber, double secondNumber) {
        Assert.assertEquals(expected, Calculator.sum(firstNumber, secondNumber));
    }

    @Test(dataProvider = "testEqualsNegativeSum")
    public void testEqualsNegativeSum(double expected, double firstNumber, double secondNumber) {
        Assert.assertNotEquals(expected, Calculator.sum(firstNumber, secondNumber));
    }

    @Test(dataProvider = "testEqualsPositiveSub")
    public void testEqualsPositiveSub(double expected, double firstNumber, double secondNumber) {
        Assert.assertEquals(expected, Calculator.sub(firstNumber, secondNumber));
    }

    @Test(dataProvider = "testEqualsNegativeSub")
    public void testEqualsNegativeSub(double expected, double firstNumber, double secondNumber) {
        Assert.assertNotEquals(expected, Calculator.sub(firstNumber, secondNumber));
    }

    @Test(dataProvider = "testEqualsPositiveMult")
    public void testEqualsPositiveMult(double expected, double firstNumber, double secondNumber) {
        Assert.assertEquals(expected, Calculator.mult(firstNumber, secondNumber));
    }

    @Test(dataProvider = "testEqualsNegativeMult")
    public void testEqualsNegativeMult(double expected, double firstNumber, double secondNumber) {
        Assert.assertNotEquals(expected, Calculator.mult(firstNumber, secondNumber));
    }

    @Test(dataProvider = "testEqualsPositiveDiv")
    public void testEqualsPositiveDiv(double expected, double firstNumber, double secondNumber) {
        Assert.assertEquals(expected, Calculator.div(firstNumber, secondNumber));
    }

    @Test(dataProvider = "testEqualsNegativeDiv")
    public void testEqualsNegativeDiv(double expected, double firstNumber, double secondNumber) {
        Assert.assertNotEquals(expected, Calculator.div(firstNumber, secondNumber));
    }

    @Test(dataProvider = "testNumberFormatException", expectedExceptions = NumberFormatException.class)
    public void testNumberFormatExceptionSum(Object expected, Object firstNumber, Object secondNumber) {
        Assert.assertEquals(expected, Calculator.sum(Double.parseDouble(String.valueOf(firstNumber)), Double.parseDouble(String.valueOf(secondNumber))));
    }

    @Test(dataProvider = "testNumberFormatException", expectedExceptions = NumberFormatException.class)
    public void testNumberFormatExceptionSub(Object expected, Object firstNumber, Object secondNumber) {
        Assert.assertEquals(expected, Calculator.sub(Double.parseDouble(String.valueOf(firstNumber)), Double.parseDouble(String.valueOf(secondNumber))));
    }

    @Test(dataProvider = "testNumberFormatException", expectedExceptions = NumberFormatException.class)
    public void testNumberFormatExceptionMult(Object expected, Object firstNumber, Object secondNumber) {
        Assert.assertEquals(expected, Calculator.mult(Double.parseDouble(String.valueOf(firstNumber)), Double.parseDouble(String.valueOf(secondNumber))));
    }

    @Test(dataProvider = "testNumberFormatException", expectedExceptions = NumberFormatException.class)
    public void testNumberFormatExceptionDiv(Object expected, Object firstNumber, Object secondNumber) {
        Assert.assertEquals(expected, Calculator.div(Double.parseDouble(String.valueOf(firstNumber)), Double.parseDouble(String.valueOf(secondNumber))));
    }

    @Test(dataProvider = "testArithmeticException", expectedExceptions = ArithmeticException.class)
    public void testArithmeticExceptionDiv(Object expected, Object firstNumber, Object secondNumber) {
        Assert.assertEquals(expected, Calculator.div(Double.parseDouble(String.valueOf(firstNumber)), Double.parseDouble(String.valueOf(secondNumber))));
    }
}
