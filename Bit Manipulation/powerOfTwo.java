/*
Problem: Power of Two
Platform: LeetCode
Link: https://leetcode.com/problems/power-of-two/
Topic: Bit Manipulation
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
/*  A power of two has only one set bit.
    Subtracting 1 flips that bit to 0 and all lower bits to 1.
    So n & (n-1) removes the only set bit, resulting in 0.  */
    return n > 0 && (n & (n-1)) == 0;
    }
}