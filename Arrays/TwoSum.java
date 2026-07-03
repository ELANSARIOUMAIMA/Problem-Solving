# Problem-Solving
/*
Problem: Two Sum
Platform: LeetCode
Pattern: HashMap
Difficulty: Easy

Time Complexity: O(n)
Space Complexity: O(n)

Key Idea:
Use a HashMap to store previously seen numbers and their indices.
*/
class Solution {

    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i= 0;i<nums.length;i++){
            
            int complement=target-nums[i];

            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);

        }
        return new int[]{};

        
    
}
}
