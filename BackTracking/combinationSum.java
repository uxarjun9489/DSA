package BackTracking;
/*
Problem: Combination Sum
Platform: LeetCode
Link: https://leetcode.com/problems/combination-sum/
Topic: Backtracking
*/
import java.util.*;
    class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    // Empty answerList
    List<List<Integer>> answerList = new ArrayList<>();
    // Sorting for pruning
    Arrays.sort(candidates);
    backTrack(answerList,new ArrayList<>(), candidates, target, 0);
    return answerList;
    }
    private void backTrack(List<List<Integer>> ans, List<Integer> temp, int[] arr, int target, int index){
    // Our elements sum up to the target
    if(target == 0){
        ans.add(new ArrayList<>(temp));
        return;
    }
    if(index == arr.length) return;
    // Include exclude based no loop
    if(arr[index] <= target){
        // Including 
        temp.add(arr[index]);
        backTrack(ans,temp,arr,target - arr[index],index);
        // Excluding
        temp.remove(temp.size() - 1);
        backTrack(ans,temp,arr,target,index+1);
    }
    }
}

