package org.egi.calculator;

import org.egi.exceptions.NegativeNumbersException;
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
                int number = Integer.valueOf(num).intValue();
                if (number < 0){
                    throw new NegativeNumbersException();
                }
                result += number;
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
