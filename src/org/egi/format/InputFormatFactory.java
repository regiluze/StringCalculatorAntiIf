package org.egi.format;

/**
 * Created by regiluze on 27/3/15.
 */
public class InputFormatFactory{

    public StringNumbersInput get(String numbers){
        if (numbers.startsWith("//")){
            return new DifferentDelimiterInput(numbers);
        }
        return new DefaultInput(numbers);

    }

}
