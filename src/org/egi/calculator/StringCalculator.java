package org.egi.calculator;

import org.egi.exceptions.NegativeNumbersException;
import org.egi.format.InputFormatFactory;
import org.egi.format.StringNumbersInput;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by regiluze on 27/3/15.
 */
public class StringCalculator {

    private List<Integer> negatives = new ArrayList<Integer>();

    public int add(String numbers) {
        int result = 0;
        for (String num : splitNumbers(numbers)){
            result += checkNumber(num);
        }
        checkNegativeNumbers();
        return result;
    }

    private int checkNumber(String num){
        int result = 0;
        try {
            int number = Integer.valueOf(num).intValue();
            if (number < 0){
                negatives.add(number);
            }
            result = number;
        }catch (NumberFormatException ex){
        }
        return result;
    }

    private void checkNegativeNumbers(){
        if (negatives.size() > 0){
            throw new NegativeNumbersException(negatives);
        }
    }

    private String[] splitNumbers(String numbers){
        StringNumbersInput input = new InputFormatFactory(). get(numbers);
        String formated_numbers = input.getNumbers();
        return formated_numbers.split(input.getDelimiter());
    }

}
