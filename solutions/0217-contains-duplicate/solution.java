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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
    }
}
