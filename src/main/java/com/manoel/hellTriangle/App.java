package com.manoel.hellTriangle;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {

       int[][] ints= new int [][] {{6},
                                   {3, 5},
                                   {9, 7, 1},
                                   {4, 6, 8, 4}
                                  };
      Triangle t =  new Triangle(ints);
      System.out.println(t.maxTotal());
    }
}
