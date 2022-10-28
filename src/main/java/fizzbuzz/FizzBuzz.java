package main.java.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz
{

//    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//    answer[i] == "Fizz" if i is divisible by 3.
//    answer[i] == "Buzz" if i is divisible by 5.
//    answer[i] == i (as a string) if none of the above conditions are true.


    public static void main(String[] args)
    {
        List<String> fizzBuzz = fizzBuzz(3);
        for(String s : fizzBuzz)
        {
            System.out.println(s);
        }
    }

    public static List<String> fizzBuzz(int n)
    {
        List<String> back = new ArrayList<>(n);
        for(int i = 1; i <= n; i++)
        {
            if(divisibleByThreeAndFive(i))
            {
                back.add("FizzBuzz");
            }
            else if(divisibleByFive(i))
            {
                back.add("Buzz");
            }
            else if(divisibleByThree(i))
            {
                back.add("Fizz");
            }
            else
            {
                back.add(String.valueOf(i));
            }
        }
        return back ;
    }
    
    public static boolean divisibleByThreeAndFive(int i)
    {
        return (divisibleByThree(i) && divisibleByFive(i)) ? true:false;
    }
    
    public static boolean divisibleByThree(int i)
    {
        int is = i % 3;
        return is == 0 ? true : false;
    }
    
    public static boolean divisibleByFive(int i)
    {
        int is = i % 5;
        return is == 0 ? true : false;
    }
}
