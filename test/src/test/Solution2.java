package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	
	    public int[] twoSum(int[] nums, int target) {
	//        Arrays.sort(nums);
	        int result[]=new int[2];
	        Map<Integer,Integer> map=new HashMap();
	        
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            
	            
	          
	        	if(map.containsKey(target-nums[i]))
	                {
	        	
	
	                    result[1]=i;
	                  result[0]=map.get(target-nums[i]);
	                }
	                
	                
	                map.put(nums[i], i);
	            }
	        
	       return result;
	    }
	    public static void main(String[] args) {
	    	Solution2 sol=new Solution2();
	        int nums[]=new int[] {4,0,2};
	        int target=6;
	    	System.out.println(sol.twoSum(nums, target));
	    }
}
	        

