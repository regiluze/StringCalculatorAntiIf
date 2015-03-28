package org.egi.exceptions;

import java.util.List;

/**
 * Created by regiluze on 28/3/15.
 */
public class NegativeNumbersException extends RuntimeException{

    public NegativeNumbersException(List<Integer> nums){
        super(formatMsg(nums));
    }

    private static String formatMsg(List<Integer> numbers) {
        StringBuilder msg = new StringBuilder("[");
        for (Integer num : numbers){
            msg.append(num);
            msg.append(",");
        }
        msg.deleteCharAt(msg.length()-1);
        msg.append("]");
        return msg.toString();
    }



}
