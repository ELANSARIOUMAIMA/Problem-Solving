/*
Problem: Product of Array Except Self
Pattern: Prefix & Suffix
Difficulty: Medium

Idea:
- prefix[i] = product of all elements before i
- suffix[i] = product of all elements after i
- answer[i] = prefix[i] * suffix[i]

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // example Input: nums = [1,2,3,4]
       //  Output: [2*3*4,1*3*4,1*2*4,1*2*2]
      // [24,12,8,6]
      // the main idea is to use the prefix and the suffix
      int [] prefix = new int[nums.length];
      int [] suffix=new int[nums.length];
      int [] answer = new int[nums.length];

      prefix[0]=1;
      suffix[nums.length-1]=1;

      for(int i=1;i<nums.length;i++){
        prefix[i]=prefix[i-1]*nums[i-1];
      }

      for(int i=nums.length-2;i>=0;i--){
        suffix[i]=suffix[i+1]*nums[i+1];
      }

      for(int i=0;i<nums.length;i++){
        answer[i]=prefix[i]*suffix[i];
      }

      return answer;
       
    }
}
