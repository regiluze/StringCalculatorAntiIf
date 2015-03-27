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
            result += checkNumber(num);
        }
        return result;
    }

    private int checkNumber(String num){
        int result = 0;
        try {
            int number = Integer.valueOf(num).intValue();
            checkNegativeNumbers(number);
            result = number;
        }catch (NumberFormatException ex){
        }
        return result;
    }

    private void checkNegativeNumbers(int num){
        if (num < 0){
            throw new NegativeNumbersException();
        }
    }

    private String[] splitNumbers(String numbers){
        StringNumbersInput input = new InputFormatFactory(). get(numbers);
        String formated_numbers = input.getNumbers();
        return formated_numbers.split(input.getDelimiter());
    }

}
