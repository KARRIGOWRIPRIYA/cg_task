package com.tnsf.arrays;
/*Given an array of integer numbers and an integer target, return indices of the two numbers such
that they add up to target.

Example 1:
 Input : nums=[2,7,11,15],traget=9
output:[0,1]
Explanation: Because nums[0] + nums[1]==9,me return [0,1],
*/

public class AddTarget {
	
	public static void main(String[] args) {
int [] arr = {2,7,11,15};

for(int i=0; i<arr.length-1; i++)
{
    for(int j=0; j<=arr.length-2; j++)
    {
        if
        ((arr[i]+arr[j+1])==9)
        { 
            System.out.println("indices = "+"["+i +","+(j+1)+"]");
        }
        
    }
 }
}
}
