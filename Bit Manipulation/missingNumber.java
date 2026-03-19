/*
Problem: Power of Two
Platform: LeetCode
Link: https://leetcode.com/problems/missing-number/
Topic: Bit Manipulation
*/
class Solution {
    public int missingNumber(int[] nums) {
        int ans = nums.length;
    for(int i = 0; i<nums.length; i++){
//We XOR the array elements with all the indices.At the end we are left with the only number whose pair we couldn't find aka the missing number.
         ans ^= i ^nums[i];
    }
    return ans;
    }
}