package test.java.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.java.fizzbuzz.FizzBuzz;

public class TestFizzBuzz
{

    @Test
    public void testOne()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> res = new ArrayList<>(Arrays.asList("1", "2", "Fizz"));
        assertEquals(res, fizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testTwo()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> res = new ArrayList<>(Arrays.asList("1", "2", "Fizz", "4", "Buzz"));
        assertEquals(res, fizzBuzz.fizzBuzz(5));
    }

    @Test
    public void testThree()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> res = new ArrayList<>(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
        assertEquals(res, fizzBuzz.fizzBuzz(15));
    }

}
