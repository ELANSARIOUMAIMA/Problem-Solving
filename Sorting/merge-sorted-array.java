class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=m-1;
        int n2=n-1;
        int i=n+m-1;
        while(n2>=0){
            if(n1>=0&&nums1[n1]>nums2[n2]){
                nums1[i]=nums1[n1];
                n1--;
            }
            else{
                nums1[i]=nums2[n2];
                n2--;
            }
            i--;
        }
    }
}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer_1 = m - 1;
        int pointer_2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (pointer_2 < 0)
                break;
            if (pointer_1 >= 0 && nums1[pointer_1] > nums2[pointer_2]) {
                nums1[i] = nums1[pointer_1];
                pointer_1--;

            } else {
                nums1[i] = nums2[pointer_2];
                pointer_2--;

            }

        }
        return;

    }
}
