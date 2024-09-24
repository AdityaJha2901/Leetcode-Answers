class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        
        //add last k elements 
        if(k>nums.length){
            k=k%nums.length;
        }
        
        if (k<=0){
            return;
        }

        

        for (int i=0; k>0 ; i++){
            list.add( nums[nums.length-k]);
            k--;
        }
        for(int i =0; i<nums.length-k-1; i++){
            list.add(nums[i]);
        }
        
        for(int i =0; i<nums.length; i++){
            nums[i]=list.get(i);
        }

        
        // while(k>0){
        //     int a=nums[nums.length-1];
        //     for(int i=nums.length-1; i>=0; i--){
                
        //         if(i==0){
        //             nums[i]=a;

        //         } else {
        //             nums[i]=nums[i-1];
        //         }

        //     }
        //     k--;
        
    }
}