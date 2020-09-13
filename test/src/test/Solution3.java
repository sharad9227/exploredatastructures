package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {
	
	    public int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        int[] s=nums;
	Map<Integer,Integer> map=new HashMap();
	int count=1;
	int res=0;
	        
	        	for(int i:nums)
	        	{
	        		map.put(i,map.getOrDefault(i, 0)+1);
	        	
	        		
	        	}
	
	        	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	                int k = entry.getKey();
	                int v = entry.getValue();
	                if(v==1)
	                {
	                	res=k;
	                }
	            }
	

	return res;

	    }
	    
	    public static void main(String[] args) {
	    	Solution3 sol=new Solution3();
	        int nums[]=new int[] {2,2,3};
	        int target=6;
	        List<Integer> arr= new ArrayList<Integer>();
	        
	    	System.out.println(sol.singleNumber(nums));
	    }
	    
	    
	    
	}

