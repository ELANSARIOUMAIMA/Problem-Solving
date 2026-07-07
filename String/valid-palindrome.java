class Solution {
    
    public boolean isPalindrome(String s) {

        // A phrase is a palindrome if, after converting all uppercase letters into lowercase  letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

        String filtered = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered += Character.toLowerCase(c);
            }
        }
        int right=filtered.length()-1;// pointer rigth
        int left=0;//pointer left

        while(left<right){
           

             if(filtered.charAt(left)!=filtered.charAt(right)){
                return false;
            };
            left++;
            right--;
        }
        return true; 
    }
}
