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

    @Test
    public void should_return_5_when_add_input_is_2_and_3_with_coma(){

        assertEquals(5, cal.add("2,3"));

    }

    @Test
    public void should_return_6_when_add_input_is_1_new_line_2_and_3_with_coma(){

        assertEquals(6, cal.add("1\n2,3"));

    }

    private class StringCalculator {

        public int add(String numbers) {
            int result = 0;
            String formated_numbers = numbers.replaceAll("\n",",");
            String[] nums = formated_numbers.split(",");
            for (String num : nums){
                try {
                    result += Integer.valueOf(num).intValue();
                }catch (NumberFormatException ex){
                    break;
                }
            }
            return result;
        }

    }
}
