/*
Problem: Combination Sum
Platform: LeetCode
Link: https://leetcode.com/problems/combination-sum/
Topic: Backtracking
*/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    // Sorting is required to bring the duplicates together otherwise we won't be able to check them properly
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    backTrack(result,candidates,target,0,new ArrayList<>());
    return result;
    }
    private void backTrack(List<List<Integer>> res,int[] candidates, int target, int index, List<Integer> temp){
        // Target == 0 means -> We already have all the required elements that sum up to our target. SO we add it to our result list
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        // Index has reached the end of our array
        if(index == candidates.length){
            return;
        }

        for(int i = index; i<candidates.length; i++){
            // This condition checks if we have same element in the same level. If we do then we continue -> skip this iteration and move fwd
            if(i > index && candidates[i] == candidates[i-1]) continue;
            // Our element is greater than our target so we don't have to check any further elements in this branch
            if(candidates[i] > target) break;
            // Taking the element
            temp.add(candidates[i]);
            // Recursive call with index increased -> moving to the next level,and reducing our target from what we have already put in the list
            backTrack(res,candidates,target-candidates[i],i+1,temp);
            // Removing the last element for a fresh start when function returns
            temp.remove(temp.size() - 1);
        }
    }
}