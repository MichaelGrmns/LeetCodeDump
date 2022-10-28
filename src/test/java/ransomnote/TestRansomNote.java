package test.java.ransomnote;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import main.java.ransomnote.RansomNote;

public class TestRansomNote
{
    @Test
    public void testCaseOne()
    {
        RansomNote r = new RansomNote();
        assertEquals(false, r.canConstruct("a", "b"));
    }
    
    @Test
    public void testCaseTwo()
    {
        RansomNote r = new RansomNote();
        assertEquals(false, r.canConstruct("aa", "ab"));
    }
    
    @Test
    public void testCaseThree()
    {
        RansomNote r = new RansomNote();
        assertEquals(true, r.canConstruct("aa", "aab"));
    }
    
    @Test
    public void testCaseFour()
    {
        RansomNote r = new RansomNote();
        assertEquals(true, r.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

}
