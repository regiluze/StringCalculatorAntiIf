package org.egi.calculator;

import org.egi.exceptions.NegativeNumbersException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by regiluze on 28/3/15.
 */
public class NumberChecker {

    private List<Integer> negatives = new ArrayList<Integer>();

    public void negative_numbers(){
        if (negatives.size() > 0){
           throw new NegativeNumbersException(negatives);
        }
    }

    public void negative(int num){
       if (num < 0){
           negatives.add(num);
       }
    }

    public int valid(int number) {
        if (number > 1000){
            return 0;
        }
        return number;
    }
}
