package is.ru.hugb.calculator;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by karlkristjansson on 10/12/16.
 */
public class TestStringCalculator {

    @Test
    public final void TestStringWithTwoIntegersReturnsSum() throws Exception {
        int sum = StringCalculator.add("1,2");
        log.println("Sum: " + sum);
    }
    @Test
    public final void TestStringWithOneIntegerReturnsSum() throws Exception {
        int sum = StringCalculator.add("1");
        log.println("Sum: " + sum);
    }
    @Test
    public final void TestEmptyStringThenReturnValueIs0() throws Exception {
        int sum = StringCalculator.add("");
        log.println(sum);
    }
    @Test
    public final void TestTenNumbersThenReturnSum() throws Exception {
        int sum = StringCalculator.add("1,2,3,4,5,6,7,8,9,10");
        log.println("Sum: "+sum);
    }
    @Test
    public final void TestStringWithNewLineInString() throws Exception {
        int sum = StringCalculator.add("1,2,3,4,5\n6,7,8,9,10");
        log.println("Sum: "+sum);
    }
    @Test
    public final void TestStringWithOneNegativeNumberInString() {
        try {
            int sum = StringCalculator.add("-1,2");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public final void TestStringWithMultibleNegativeNumberInString() {
        try {
            int sum = StringCalculator.add("2,-4,3,-5");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public final void TestIfNumberInStringOver1000IsIgnored() throws Exception
    {
        int sum = StringCalculator.add("1001,2");
        log.println("Sum: "+sum);
    }
}
