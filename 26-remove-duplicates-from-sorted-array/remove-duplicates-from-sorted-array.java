class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int curr=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]!=curr){
                
                curr = nums[i];
                nums[k]=curr;
                k++;
            }
        
        }
        return k;      
        
        
    }
}