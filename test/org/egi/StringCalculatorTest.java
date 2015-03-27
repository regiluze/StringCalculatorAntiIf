package org.egi;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Test.*;

/**
 * Created by regiluze on 27/3/15.
 */
public class StringCalculatorTest {

    @Test
    public void should_return_zero_when_add_input_is_empty_string(){

        StringCalculator cal = new StringCalculator();

        assertEquals(0, cal.add(""));

    }

    private class StringCalculator {
        public int add(String numbers) {
            return 0;
        }
    }
}
