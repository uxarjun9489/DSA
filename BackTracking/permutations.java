/*
Problem: Permutations
Platform: LeetCode
Link: https://leetcode.com/problems/permutations/
Topic: Backtracking
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> answerList = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    backTrack(answerList,new ArrayList<>(),nums,used);
    return answerList;
    }
    private void backTrack(List<List<Integer>> ans, List<Integer> temp,int[] nums,boolean[] used){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            // check if our current element has been used before.
            if(used[i] == true) continue;
            // add the current element to the list
            temp.add(nums[i]);
            //mark it as used
            used[i] = true;

            // Explore 
            backTrack(ans,temp,nums,used);

            //Unmark and remove the element
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}