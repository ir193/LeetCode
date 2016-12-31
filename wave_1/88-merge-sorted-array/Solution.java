\\ https://leetcode.com/problems/merge-sorted-array

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < m; i++){
            nums1[m+n - i-1] = nums1[m - i-1];
        }

        int i = n;
        int j = 0;
        int k = 0;
        while(i < m+n || j < n){
            if(j >= n || (i < m+n && nums1[i] < nums2[j])){
                nums1[k] = nums1[i];
                i++;
                k++;
            }
            else{
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }

    }
}
