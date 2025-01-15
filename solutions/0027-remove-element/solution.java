class Solution {
    public int removeElement(int[] nums, int val) {
        int index=nums.length-1;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(index<i){
                break;
            }
            int temp = nums[index];
            System.out.println(temp);
            if(nums[i]!=val){
                count++;
            }
            else if(nums[i]==val){
               if(nums[index]==val){
                return count;
               }
               else{                
                nums[i]=temp;
                System.out.println(temp);
                nums[index]=val;
                index--;
                count++;
               }
            }
        }
        return count;
    }
}
