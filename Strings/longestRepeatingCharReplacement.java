/*
Problem: longest repeating character replacement
Platform: LeetCode
Link : https://leetcode.com/problems/longest-repeating-character-replacement/
Topic: String/Sliding window
*/
class Solution {
    public int characterReplacement(String s, int k) {
    int n = s.length();
    int left = 0,maxLen = 0,maxFreq = 0;
    int[] freq = new int[26];

    for(int right = 0; right < n; right++){
        // Directly updating the ASCII value of the character in the array
        int r = s.charAt(right) - 'A';
        freq[r]++;
        // Keeping check on the element with maximum frequency
        maxFreq = Math.max(maxFreq,freq[r]);
        
// When window size - the max freq becomes greater than K, it means we can't replace all the characters required so we Shrink
        while((right - left + 1) - maxFreq > k){
            // Shriking by the ASCII 
            freq[s.charAt(left) - 'A']--;
            left++;
        }
        maxLen = Math.max(maxLen,(right - left +1));
    }
    return maxLen;
    }
}