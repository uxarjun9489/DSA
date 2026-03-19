/*
Problem: Power of Two
Platform: LeetCode
Link: https://leetcode.com/problems/number-of-1-bits/
Topic: Bit Manipulation
*/
class Solution {
    public int hammingWeight(int n) {
    int count = 0;
    while(n != 0){
        // Using the Brian Kerninghan's Algorithm
        n = n & (n-1);
        count++;
    }
    return count;
    }
}