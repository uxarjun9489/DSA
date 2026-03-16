/*
Problem: Longest Substring without repeating characters
Platform: LeetCode
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
Topic: String
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int left = 0,maxlen = 0;
    // Frequency array for keeping count of the characters
    int[] freq = new int[256];
    for(int right = 0; right < n; right++){
        char r = s.charAt(right);
        freq[r]++;
        //If a characters freq goes over 1 then move l forward till it passes
        while(freq[r] > 1){
            char l = s.charAt(left);
            freq[l]--;
            left++;
        }
    maxlen = Math.max(maxlen,right-left+1);
    } 
    return maxlen; 
    }
}