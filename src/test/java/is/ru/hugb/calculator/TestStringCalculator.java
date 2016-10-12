package is.ru.hugb.calculator;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by karlkristjansson on 10/12/16.
 */
public class TestStringCalculator {

    @Test
    public final void TestStringWithTwoIntegersReturnsSum() {
        int sum = StringCalculator.add("1,2");
        log.println("Sum: " + sum);
    }
    @Test
    public final void TestStringWithOneIntegerReturnsSum() {
        int sum = StringCalculator.add("1");
        log.println("Sum: " + sum);
    }
    @Test
    public final void TestEmptyStringThenReturnValueIs0() {
        int sum = StringCalculator.add("");
        log.println(sum);
    }

}