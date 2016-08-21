package com.manoel.hellTriangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TriangleTest
    extends TestCase
{
    public TriangleTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( TriangleTest.class );
    }

    public void testSum()
    {
      int[][] ints = new int [][] {{6},
                                   {3, 5},
                                   {9, 7, 1},
                                   {4, 6, 8, 4}
                                  };
      Triangle t = new Triangle(ints);
      assertEquals("Total sum should be 26.", t.maxTotal(), 26);
    }

    public void testEmptySum(){
      int[][] ints = new int [][]{};
      Triangle t = new Triangle(ints);
      assertEquals("Empty array should sum to 0.", t.maxTotal(), 0);
    }

    public void testSumOneElement(){
      int[][] ints = new int [][]{{4}};
      Triangle t = new Triangle(ints);
      assertEquals("With only one element. This element should be equal the sum.", t.maxTotal(), 4);
    }
}
