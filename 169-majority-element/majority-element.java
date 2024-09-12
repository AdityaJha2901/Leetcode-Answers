class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        //counter
        int c=1;
        // current element
        int curr = nums[0];
        
        //logic
        for(int i=1; i<nums.length; i++){

            //checking
            if(nums[i]==curr){
                c++;
            }
            
            else if(nums[i]!= curr && c>nums.length/2){
                break;
            }
            else {
                c=1;
                curr= nums[i];
            }

            
        }
        return curr;
    } 
}