class Solution {
    public boolean isArraySpecial(int[] nums) {
        int slow=0;
        int fast=slow+1;
        for(int i=0;i<nums.length;i++){
            if(fast<=nums.length-1){
            if(nums[slow]%2!=nums[fast]%2){
                slow++;fast++;
            }
            else{
               return false; 
            }
            }
            else{
                return true;
            }
        }
        return true;
    }
}
