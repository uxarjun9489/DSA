/*
Problem: Two sum - II (input array is sorted)
Platform: LeetCode
Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
Topic: Arrays,Two-Pointer
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int arr[] = new int[2];
    int right = numbers.length-1;
    int left = 0;
    while(left < right){
        int sum = numbers[left] + numbers[right];
        // If we have found our solution we return it
        if(sum == target){
            arr[0] = left + 1;
            arr[1] = right + 1;
            return arr;
        }
        // If the sum is greater than the target than it means that our rightmost number is quite big so we move the right pointer backwards
        else if(sum> target) right--;
        // If the sum is less than the target than it means that our leftmost number is a bit too low so we move the left pointer forward
        else if(sum < target) left++;
    }
    // return an array for just in case. The problem says that answer would be found so no probs
    return new int[]{-1,-1};
    }
}