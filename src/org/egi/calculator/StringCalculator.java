package org.egi.calculator;

import org.egi.format.InputFormatFactory;
import org.egi.format.StringNumbersInput;

/**
 * Created by regiluze on 27/3/15.
 */
public class StringCalculator {


    public int add(String numbers) {
        int result = 0;
        for (String num : splitNumbers(numbers)){
            try {
                result += Integer.valueOf(num).intValue();
            }catch (NumberFormatException ex){
                break;
            }
        }
        return result;
    }

    private String[] splitNumbers(String numbers){
        StringNumbersInput input = new InputFormatFactory(). get(numbers);
        String formated_numbers = input.getNumbers();
        return formated_numbers.split(input.getDelimiter());
    }

}
