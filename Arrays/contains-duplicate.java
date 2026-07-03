// Version 1 — Brute Force
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Version 2 — HashMap
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            //map.put(num,map.getOrDefault(num,0)+1);
            if(map.containsKey(num))return true;
            map.put(num,1);
        }
        return false;   
    }
}

// Version 3 — Best implementation with HashSet
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
              // true → the element was not already in the set, so it was added successfully.
             // false → the element was already present, so nothing was added.
                return true;
            }
        }

        return false;
    }
}
