package org.egi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Test.*;

/**
 * Created by regiluze on 27/3/15.
 */
public class StringCalculatorTest {

    StringCalculator cal;

    @Before
    public void setup(){
        cal = new StringCalculator();
    }

    @Test
    public void should_return_zero_when_add_input_is_empty_string(){

        assertEquals(0, cal.add(""));

    }

    @Test
    public void should_return_one_when_add_input_is_one(){

        assertEquals(1, cal.add("1"));

    }

    private class StringCalculator {
        public int add(String numbers) {
            if (numbers.isEmpty()){
                return 0;
            }
            return Integer.valueOf(numbers);
        }
    }
}
