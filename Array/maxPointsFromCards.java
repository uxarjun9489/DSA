/*
Problem: Maximum points you can obtain from cards
Platform: LeetCode
Link: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
Topic: Arrays,Sliding Window
*/
class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int n = cardPoints.length;
    int leftSum = 0,rightSum = 0,maxSum = 0;
    for(int i = 0; i<k; i++){
        leftSum += cardPoints[i];
        maxSum = leftSum;
    }
    int rIndex = n-1;
    for(int i = k-1; i>=0; i--){
        leftSum -= cardPoints[i];
        rightSum += cardPoints[rIndex];
        rIndex--;
    maxSum = Math.max(maxSum,leftSum + rightSum);
    }
    return maxSum;
    }
}