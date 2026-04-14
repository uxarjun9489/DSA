/*
Problem: mimimum window substring
Platform: LeetCode
Link: https://leetcode.com/problems/minimum-window-substring/
Topic: String
*/
class Solution {
    public String minWindow(String s, String t) {
    int[] need = new int[128]; // The elements of t string counter
    int[] window = new int[128]; // The elements in our current window counter
    int required = 0; // This variable contains the total number of characters of the t string.
    for(char ch : t.toCharArray()){
       if(need[ch] == 0)required++;
       need[ch]++;
    }
    int left = 0; 
    int start = 0;
    int minLen = Integer.MAX_VALUE;
    int formed = 0; // This is a counter which tells us if we have found a match.
    for(int right = 0; right < s.length(); right++){
        char r = s.charAt(right);
        window[r]++;
        if(need[r] > 0 && window[r] == need[r]){
            formed++;
        }
            while(formed == required){
                if(right - left + 1 < minLen){ 
                minLen = right - left + 1;
                start = left;
                }
                char l = s.charAt(left);
                window[l]--;
                if(need[l] > 0 && window[l] < need[l]){
                    formed--;
                }
                left++;
            }
    }
    String ans = "";
    if(minLen == Integer.MAX_VALUE){
        return ans;
    }
    else{
        ans = s.substring(start , start + minLen);
    }
    return ans;
    }
}
