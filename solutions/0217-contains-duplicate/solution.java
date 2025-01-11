class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nsk = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            nsk.add(nums[i]);
        }
        if(nums.length==nsk.size()){
            return false;
        }
        else{
            return true;
        }  
    }

}
