class Solution {
    public int removeElement(int[] nums, int val) {
        //List<Integer> l1= new ArrayList<>();
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
               int temp = nums[k];
               nums[k] = nums[i];
               nums[i] = temp;
               k++;

            }
        }
        return k;
    }
}