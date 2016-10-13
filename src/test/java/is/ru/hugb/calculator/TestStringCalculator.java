package is.ru.hugb.calculator;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by karlkristjansson on 10/12/16.
 */
public class TestStringCalculator {

    @Test
    public final void TestStringWithTwoIntegersReturnsSum() throws Exception {
        assertEquals(3,StringCalculator.add("1,2"));
    }
    @Test
    public final void TestStringWithOneIntegerReturnsSum() throws Exception {
        assertEquals(1,StringCalculator.add("1"));
    }
    @Test
    public final void TestEmptyStringThenReturnValueIs0() throws Exception {
        assertEquals(0,StringCalculator.add(""));
    }
    @Test
    public final void TestTenNumbersThenReturnSum() throws Exception {
        assertEquals(55,StringCalculator.add("1,2,3,4,5,6,7,8,9,10"));
    }
    @Test
    public final void TestStringWithNewLineInString() throws Exception {
        assertEquals(55,StringCalculator.add("1,2,3,4,5\n6,7,8,9,10"));
    }
    @Test
    public final void TestStringWithOneNegativeNumberInString() {
        try {
            StringCalculator.add("-1,2");
        }
        catch (Exception e) {
            String expected ="Negatives not allowed: -1,";
            assertEquals(expected,e.getMessage());
            e.printStackTrace();
        }
    }
    @Test
    public final void TestStringWithMultibleNegativeNumberInString() {
        try {
            StringCalculator.add("2,-4,3,-5");
        }
        catch (Exception e) {
            String expected ="Negatives not allowed: -4,-5,";
            assertEquals(expected,e.getMessage());
            e.printStackTrace();
        }
    }
    @Test
    public final void TestIfNumberInStringOver1000IsIgnored() throws Exception {
        assertEquals(2,StringCalculator.add("1001,2"));
    }
    @Test
    public final void TestUndefinedDelimiter() throws Exception {
        assertEquals(3,StringCalculator.add("//;\n1;2"));
    }
    @Test
    public final void TestUndefinedDelimiter2() throws Exception {
        assertEquals(3,StringCalculator.add("//;;\n1;;2"));
    }
}
