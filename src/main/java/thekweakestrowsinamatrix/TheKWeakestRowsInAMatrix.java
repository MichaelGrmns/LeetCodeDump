package main.java.thekweakestrowsinamatrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TheKWeakestRowsInAMatrix
{

    public static void main(String[] args)
    {
        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int[] kWeakestRows = kWeakestRows(mat, 3);
        for(int i : kWeakestRows)
        {
            System.out.println(i);
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k)
    {
        int[] back = new int[k];
        
        Map<Integer, Integer> indexToSize = new HashMap<>(); 
        for(int i = 0; i < mat.length; i++)
        {
            int countSoldiers = 0;
            for(int j = 0; j < mat[i].length; j++)
            {
                if(mat[i][j] == 1) countSoldiers++;
            }
            indexToSize.put(i, countSoldiers);
        }
        ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(indexToSize.entrySet());
        list.sort(Entry.comparingByValue());
        for(int i = 0; i < k; i++)
        {
            back[i] = list.get(i).getKey();
        }
        
        return back;
    }

}
