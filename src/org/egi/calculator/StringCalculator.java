package org.egi.calculator;

import org.egi.format.InputFormatFactory;
import org.egi.format.StringNumbersInput;


/**
 * Created by regiluze on 27/3/15.
 */
public class StringCalculator {

    private NumberChecker _checker;

    public StringCalculator(NumberChecker checker){
        _checker = checker;
    }

    public int add(String numbers) {
        int result = 0;
        for (String num : splitNumbers(numbers)){
            result += checkNumber(num);
        }
        _checker.negative_numbers();
        return result;
    }

    private int checkNumber(String num){
        try {
            int number = Integer.valueOf(num).intValue();
            _checker.negative(number);
            return _checker.valid(number);
        }catch (NumberFormatException ex){
            return 0;
        }
    }

    private String[] splitNumbers(String numbers){
        StringNumbersInput input = new InputFormatFactory().get(numbers);
        String formated_numbers = input.getNumbers();
        return formated_numbers.split(input.getDelimiter());
    }

}
