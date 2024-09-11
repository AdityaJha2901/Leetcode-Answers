class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=nums1.length-nums2.length; i<nums1.length; i++){
            nums1[i]=nums2[i-(nums1.length-nums2.length)];
        }
        Arrays.sort(nums1);
        return;

    }
}