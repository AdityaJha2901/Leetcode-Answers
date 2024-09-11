class Solution {
    public int removeElement(int[] nums, int val) {
        //List<Integer> l1= new ArrayList<>();
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
               // l1.add(nums[i]);
                nums[i]= Integer.MAX_VALUE;
                k++;
            }
        }
        Arrays.sort(nums);
        k= nums.length - k;
        return k;
    }
}