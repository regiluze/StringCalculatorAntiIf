package org.egi.format;

/**
 * Created by regiluze on 27/3/15.
 */
public class DifferentDelimiterInput extends StringNumbersInput {

    public DifferentDelimiterInput(String numbers){
        _delimiter = numbers.substring(2,3);
        _numbers = numbers.substring(4);
    }
}
