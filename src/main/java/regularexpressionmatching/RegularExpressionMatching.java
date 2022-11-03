package main.java.regularexpressionmatching;

public class RegularExpressionMatching
{
    /*
     * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
    
    '.' Matches any single character.​​​​
    '*' Matches zero or more of the preceding element.
    
    The matching should cover the entire input string (not partial).
     */

    public static void main(String[] args)
    {
        System.out.println(isMatch("aaaab", "a*"));
    }

    public static boolean isMatch(String s, String p)
    {
        char[] pArray = p.toCharArray();
        char[] sArray = s.toCharArray();
        int geprüfteStelleInS = 0;
        AX: for (int i = 0; i < pArray.length; i++)
        {
            if(geprüfteStelleInS >= sArray.length) return false;
            String valueS = String.valueOf(sArray[geprüfteStelleInS]);
            String valueP = String.valueOf(pArray[i]);
            String nextP = "";
            if(i+1 < pArray.length)
            {
                nextP = String.valueOf(pArray[i+1]);
            }
            System.out.println(valueP);
            if (".".equals(valueP))
            {
                if("*".equals(nextP))
                {
                    System.out.println("Sternchen nach Punkt");
                }
                else
                {
                    System.out.println("Punkt gefunden");
                    continue AX;
                }
            }
            else
            {
                if("*".equals(nextP))
                {
                    System.out.println("Sternchen nach Buchstabe gefunden");
                    if(!valueP.equals(valueS)) i++;
                    boolean passt = true;
                    while(passt)
                    {
                        if(geprüfteStelleInS < sArray.length)
                        {
                            String f = String.valueOf(sArray[geprüfteStelleInS]);
                            if(valueP.equals(f))
                            {
                                System.out.println(valueP + " == " + f);
                                geprüfteStelleInS++;
                            }
                            else
                            {
                                passt = false;
                            }
                        }
                        else
                        {
                            return true;
                        }
                    }
                }
                else
                {
                    System.out.println("Genauer Buchstaben Vergleich");
                    if(valueP.equals(valueS)) 
                    {
                        geprüfteStelleInS++;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        if(geprüfteStelleInS < sArray.length) return false;
        return true;
    }
}
