package test.java.regularexpressionmatching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.java.regularexpressionmatching.RegularExpressionMatching;

public class TestRegularExpressionMatching
{

    @Test
    public void testOne()
    {
        String s = "aa";
        String p = "a";
        
        boolean exp = false;
        
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean res = regularExpressionMatching.isMatch(s, p);
        
        assertEquals(exp, res);
    }
    
    @Test
    public void testTwo()
    {
        String s = "aa";
        String p = "a*";
        
        boolean exp = true;
        
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean res = regularExpressionMatching.isMatch(s, p);
        
        assertEquals(exp, res);
    }
    
    @Test
    public void testThree()
    {
        String s = "ab";
        String p = ".*";
        
        boolean exp = true;
        
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean res = regularExpressionMatching.isMatch(s, p);
        
        assertEquals(exp, res);
    }
    
}
