package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Solution1{
	

public Set threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    
   Set< List<Integer>> hset=new HashSet<List<Integer>>(res);
   
    for (int i = 0; i < num.length; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    System.out.println(lo);
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                  //  while (lo < hi && num[lo] == num[lo+1]) lo++;
                   //while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
    hset.addAll(res);
    
    return hset;
}



public static void main(String[] args) {
	Solution1 sol=new Solution1();
	int numse[]=new int[] {};
	int num[]=new int[]{-4,-1,-1,-1,0,0,1,1,2};
	System.out.println(sol.threeSum(num));
}
}

