/*
Problem: Number of even odd bits
Platform: LeetCode
Link: https://leetcode.com/problems/number-of-even-and-odd-bits/
Topic: Bit Manipulation
*/
class Solution {
    public int[] evenOddBit(int n) {
    int arr[] = new int[2];
    // For checking the position
    int index = 0;
    while(n != 0){
        // This tells us about the LSB if it is 1 or 0
        int bit = n & 1;
        if(bit == 1){
            // This increments the correct position of the array
            arr[index % 2]++;
        }
        // Shifting one place to the right
        n = n >> 1;
        index++;
    }
    return arr;
    }
}