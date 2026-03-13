/*
Problem: Remove Duplicates from Sorted Array
Platform: LeetCode
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Topic: Arrays,Two-Pointer
*/
class Solution { 
   public int removeDuplicates(int[] nums) {
    //slow pointer
    int i = 0;
    //fast pointer traversal
    for(int j = 1; j<nums.length; j++){
        if(nums[j] != nums[i]){
            //Unique element found
            i++;
            //Overwriting the array
            nums[i] = nums[j];
        }
    }
    return i + 1;
    }
}