/*
Problem: 4Sum
Platform: LeetCode
Link: https://leetcode.com/problems/4sum/
Topic: Arrays,Two-Pointer
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for(int i = 0; i<nums.length - 3; i++){ // First loop goes till n-3 because we have 3 pointers ahead of it already to cover their part
        if(i > 0 && nums[i] == nums[i-1])continue; // condition for checking duplicates
        for(int j = i+1; j<nums.length - 2; j++){ // Second loop goes till n-2 because we have 2 pointers ahead of it...
            if(j>i+1 && nums[j] == nums[j-1])continue; // Checking duplicates again
            int left = j + 1;
            int right = nums.length - 1;
            while(left < right){
                long sum = (long)nums[i] + nums[j] + nums[left] + nums[right]; // Long because sum might exceed the limits of int
                if(sum == target){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right])); 
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++; // Duplicates checking
                    while(left < right && nums[right] == nums[right+1])right--; // Duplicates checking
                }
                else if(sum > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
    }   
    return ans; 
    }
}