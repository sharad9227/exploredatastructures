package test;

import java.util.List;
import java.util.ArrayList;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution6
{        
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
        List<Integer> inputList = new ArrayList<Integer>();
        List<Integer> finalList = new ArrayList<Integer>();

  // Covert integer array as list 

    for (int i :states)
        {
            inputList.add(i);
        }

 //  for loop for finding status after number of days. 

        for(int i=1; i<= days; i++)
        {
            if(i==1)
            {
                finalList = nextDayStatus(inputList);
            }
            else
            {
                finalList = nextDayStatus(finalList);
            }

        }
        return finalList;
    }

    //  find out status of next day, get return as list 

    public List<Integer> nextDayStatus(List<Integer> input)
    {
        List<Integer> output = new ArrayList<Integer>();
        input.add(0,0);
        input.add(0);

        for(int i=0; i < input.size()-2; i++)
        {
            if (input.get(i) == input.get(i+2))
            {
                output.add(0);   
            }
            else
            {
                output.add(1);
            }
        }
        return output;
    }
    
    
    
    public static void main(String[] args) {
    	Solution6 sol=new Solution6();
        int nums[]=new int[] {1,0,0,0,0,1,0,0};
        int target=6;
    	System.out.println(sol.cellCompete(nums,1));
    }
  // METHOD SIGNATURE ENDS
}