package org.egi;

import org.egi.calculator.NumberChecker;
import org.egi.calculator.StringCalculator;
import org.egi.exceptions.NegativeNumbersException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by regiluze on 27/3/15.
 */
public class StringCalculatorTest {

    StringCalculator cal;

    @Before
    public void setup(){
        cal = new StringCalculator(new NumberChecker());
    }

    @Test
    public void should_return_zero_when_add_input_is_empty_string(){

        assertEquals(0, cal.add(""));

    }

    @Test
    public void should_return_one_when_add_input_is_one(){

        assertEquals(1, cal.add("1"));

    }

    @Test
    public void should_return_5_when_add_input_is_2_and_3_with_coma(){

        assertEquals(5, cal.add("2,3"));

    }

    @Test
    public void should_return_6_when_add_input_is_1_new_line_2_and_3_with_coma(){

        assertEquals(6, cal.add("1\n2,3"));

    }

    @Test
    public void should_return_6_when_add_input_is_1_new_line_2_and_3_with_coma_and_different_delimiter(){

        assertEquals(6, cal.add("//;\n3;3"));

    }

    @Test(expected = NegativeNumbersException.class)
    public void should_throw_an_exception_when_there_are_negative_numbers(){

        assertEquals(6, cal.add("//;\n-3;3"));

    }

    @Test
    public void should_include_negative_numbers_in_exception_message_when_there_are_negative_numbers(){

        try{
            assertEquals(6, cal.add("//;\n-3;-3"));
        }catch (Exception ex){
            assertEquals("[-3,-3]",ex.getLocalizedMessage());
        }

    }

    @Test
    public void should_ignore_numbers_bigger_then_1000(){

        assertEquals(3, cal.add("//;\n1003;3"));

    }

}
