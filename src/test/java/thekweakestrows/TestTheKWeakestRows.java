package test.java.thekweakestrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import main.java.thekweakestrowsinamatrix.TheKWeakestRowsInAMatrix;

public class TestTheKWeakestRows
{

    @Test
    public void testOne()
    {
        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;

        TheKWeakestRowsInAMatrix theKWeakestRowsInAMatrix = new TheKWeakestRowsInAMatrix();
        int[] res = theKWeakestRowsInAMatrix.kWeakestRows(mat, k);

        int[] exp = {2, 0, 3};

        assertEquals(true, Arrays.equals(res, exp));

    }

    @Test
    public void testTwo()
    {
        int[][] mat = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int k = 2;

        TheKWeakestRowsInAMatrix theKWeakestRowsInAMatrix = new TheKWeakestRowsInAMatrix();
        int[] res = theKWeakestRowsInAMatrix.kWeakestRows(mat, k);

        int[] exp = {0, 2};

        assertEquals(true, Arrays.equals(res, exp));

    }
}
