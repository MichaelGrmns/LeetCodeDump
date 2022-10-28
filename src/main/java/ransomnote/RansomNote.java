package main.java.ransomnote;

import java.util.Arrays;
import java.util.List;

public class RansomNote
{
    public static void main(String[] args)
    {
        System.err.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine)
    {
        if(ransomNote.length() > magazine.length()) return false;
        boolean back = true;
        String[] rnarr = ransomNote.split("");
        List<String> rnlist = Arrays.asList(rnarr);

        String[] marr = magazine.split("");
        List<String> mlist = Arrays.asList(marr);
        
        if(!mlist.containsAll(rnlist))
        {
            return false;
        }

        rnlist.sort(String.CASE_INSENSITIVE_ORDER);
        mlist.sort(String.CASE_INSENSITIVE_ORDER);
        back = analyse(rnlist, mlist);
        
        return back;
    }

    private static boolean analyse(List<String> rnlist, List<String> mlist)
    {
        boolean back = true;
        String first = rnlist.get(0);
        int indexOfFirst = mlist.indexOf(first);
        if(indexOfFirst < 0) return false;
        List<String> newRn = rnlist.subList(1, rnlist.size());
        List<String> newM = mlist.subList(indexOfFirst+1, mlist.size());
        if(!newRn.isEmpty())
        {
            back = analyse(newRn, newM);
        }
        return back;
        
    }
    
    
}
