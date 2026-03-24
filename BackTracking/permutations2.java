/*
Problem: Permutations
Platform: LeetCode
Link: https://leetcode.com/problems/permutations-ii/
Topic: Backtracking
*/
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> answerList = new ArrayList<>();
    Arrays.sort(nums);
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
            // Check if the duplicate has been used before
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
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