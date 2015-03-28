package org.egi.calculator;

import org.egi.format.InputFormatFactory;
import org.egi.format.StringNumbersInput;


/**
 * Created by regiluze on 27/3/15.
 */
public class StringCalculator {

    private NegativeChecker _negativeChecker;

    public StringCalculator(NegativeChecker negativeChecker){
        _negativeChecker = negativeChecker;
    }

    public int add(String numbers) {
        int result = 0;
        for (String num : splitNumbers(numbers)){
            result += checkNumber(num);
        }
        _negativeChecker.apply();
        return result;
    }

    private int checkNumber(String num){
        int result = 0;
        try {
            int number = Integer.valueOf(num).intValue();
            _negativeChecker.add(number);
            result = number;
        }catch (NumberFormatException ex){
        }
        return result;
    }

    private String[] splitNumbers(String numbers){
        StringNumbersInput input = new InputFormatFactory(). get(numbers);
        String formated_numbers = input.getNumbers();
        return formated_numbers.split(input.getDelimiter());
    }

}
