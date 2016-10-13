package is.ru.hugb.calculator;

/**
 * Created by karlkristjansson on 10/12/16.
 */
public class StringCalculator {
    public static int add(String numbers) {
        if(numbers.length()==0)return 0;
        int sum = 0;
        String[] numberInArray = numbers.split(",|\n");
         for (String n : numberInArray) {
                sum += Integer.parseInt(n);
         }
        return sum;
    }
}

