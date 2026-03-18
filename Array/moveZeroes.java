/*
Problem: Move Zeroes
Platform: LeetCode
Link: https://leetcode.com/problems/move-zeroes/
Topic: Arrays,Two-Pointer
*/
class Solution {
    public void moveZeroes(int[] nums) {
    int i = 0;
    for(int j = 0; j<nums.length; j++){
        if(nums[j] != 0){
            // Overwriting the non zero elements from the start
            nums[i++] = nums[j];
        }
    while( i < nums.length){
        //Once all the non zero elements are placed correctly we replace the remanining places with zeroes
        nums[i++] = 0;
    }
    }
    }
}