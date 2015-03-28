package org.egi.calculator;

import org.egi.exceptions.NegativeNumbersException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by regiluze on 28/3/15.
 */
public class NegativeChecker {

    private List<Integer> negatives = new ArrayList<Integer>();

    public void apply(){
        if (negatives.size() > 0){
           throw new NegativeNumbersException(negatives);
        }
    }

    public void add(int num){
       if (num < 0){
           negatives.add(num);
       }
    }

}
