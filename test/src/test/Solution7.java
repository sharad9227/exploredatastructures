package test;

class Solution7 {
    public int maxSubArray(int[] nums) {
       
        int sumMax=nums[0];
        int sumMin=nums[0];
        
        

        for(int i=1;i<nums.length;i++){
            
            sumMin= Math.max(sumMin+nums[i],nums[i]);
           sumMax=Math.max(sumMax,sumMin);
        
        
        }
        
        
        

                     

                       

    return sumMax;
    }
    public static void main(String[] args) {
    	Solution7 sol=new Solution7();
        int nums[]=new int[] {-2,1,-3,4,-1,2,1,-5,8};
        int target=6;
    	System.out.println(sol.maxSubArray(nums));
    }
    
    
}
