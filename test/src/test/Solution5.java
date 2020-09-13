package test;

public class Solution5 {
    public boolean isHappy(int n) {
    	if(n<10) {
    		if(n==1||n==7) return true;
    		else return false;
    	 }
      int remainder,sum=0;
    	      while(n>0)
    	  {
    	     remainder=n%10;
    	     sum=sum+(remainder*remainder);
    	     n=n/10;
    	  }
    	  
    	 return isHappy(sum);  
    	      
    	      
    	      }
    	    
    
    
    public static void main(String[] args) {
    	Solution5 sol=new Solution5();
        int nums[]=new int[] {2,2,3};
        int target=6;
    	System.out.println(sol.isHappy(28));
    }
    
    
}