package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution4 {
    public int lengthOfLongestSubstring(String s) {
    
    	  Map<Character, Integer> map= new HashMap<>();
          int start=0, len=0;
          
          // abba
          for(int i=0; i<s.length(); i++) {
              char c = s.charAt(i);
            
              
              if(map.containsKey(c))
              {
            	  if(map.get(c)>=start)
            	  {
            		  System.out.println(c+"jj"+map.get(c));
            		  System.out.println(i+"HH");
            		  start=map.get(c)+1;
            	  }
            	  
              }
           len=Math.max(len,i-start+1);
              //putting values and index
          map.put(c, i) ;
         
          }
          System.out.println(map);
          return len;
     
    }
    
    public static void main(String[] args) {
    	Solution4 sol=new Solution4();
        int nums[]=new int[] {2,2,3};
        int target=6;
    	System.out.println(sol.lengthOfLongestSubstring("pwkepkepww"));
    }
    
    
}