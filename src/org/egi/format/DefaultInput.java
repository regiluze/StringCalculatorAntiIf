package org.egi.format;

/**
 * Created by regiluze on 27/3/15.
 */
public class DefaultInput extends StringNumbersInput {

    public DefaultInput(String numbers){
        _numbers = numbers.replaceAll("\n", DEFAULT_DELIMITER);
        _delimiter = DEFAULT_DELIMITER;
    }

}
