package is.ru.hugb.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karlkristjansson on 10/12/16.
 */

public class StringCalculator {
    public static int add(String numbers) throws Exception {
        if(numbers.length()== 0)return 0;
        int sum = 0;
        String delimiter = "";
        if(numbers.startsWith("//"))
        {
            int delimiterStart = numbers.indexOf("//")+2;
            int delimiterend = numbers.indexOf("\n");
            int numberStart = delimiterend+1;
            delimiter = numbers.substring(delimiterStart,delimiterend)+"|";
            numbers = numbers.substring(numberStart);
        }
        delimiter += ",|\n";

        String[] numberInArray = numbers.split(delimiter);
        List<String> listNegNumbers = new ArrayList();
         for (String n : numberInArray) {
             String nNegative = n;
             if(Integer.parseInt(nNegative) < 0) {
                listNegNumbers.add(nNegative);
             }
             else if (Integer.parseInt(n) < 1000) {
                 sum += Integer.parseInt(n);
             }
         }
        if(!listNegNumbers.isEmpty()) {
            String negativeNumbers = "";
            for(String numb : listNegNumbers ) {
                negativeNumbers += numb+",";
            }
            throw new Exception("Negatives not allowed: "+ negativeNumbers);
        }
        return sum;
    }
}

