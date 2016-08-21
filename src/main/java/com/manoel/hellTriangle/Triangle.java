package com.manoel.hellTriangle;
import java.util.*;

public class Triangle
{
    int[][] nodes;
    public Triangle(int[][] nodes){
      this.nodes = nodes;
    }

    public int maxTotal(){
      if(nodes.length == 0 || nodes[0].length == 0)
        return 0;

      int sum = nodes[0][0];
      int left = MaxTotalRecur(sum, 1, 0);
      int right = MaxTotalRecur(sum, 1, 1);
      return Math.max(left, right);
    }

    private int MaxTotalRecur(int sum, int level, int node){

      if (level >= nodes.length)
        return sum;

      if (node >= nodes[level].length)
        return sum;

      sum += nodes[level][node];
      int left = MaxTotalRecur(sum, level + 1, node);
      int right = MaxTotalRecur(sum, level + 1, node + 1);
      return Math.max(left, right);
    }
}
