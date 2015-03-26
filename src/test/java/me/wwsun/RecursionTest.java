package me.wwsun;

import junit.framework.TestCase;
import me.wwsun.recursion.DiskSpace;
import me.wwsun.recursion.Factorial;

import java.io.File;

/**
 * Created by Weiwei on 2015/3/26.
 */
public class RecursionTest extends TestCase {

    public void testFactorial() {
        int n = 4;
        System.out.println("Factorial("+n+")= " + Factorial.factorial(n));
        assertEquals(1, Factorial.factorial(0));
        assertEquals(2, Factorial.factorial(2));
    }

    public void testDiskUsage() {
        String path = "d:\\Movie";
        DiskSpace.diskUsage(new File(path));
    }
}
