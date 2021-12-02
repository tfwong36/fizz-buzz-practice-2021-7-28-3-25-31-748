package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void should_return_order_number_when_count_off_given_normal_case(){
        //given
        int orderNumber = 1;

        //when
        String result = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("1", result);

    }


}
