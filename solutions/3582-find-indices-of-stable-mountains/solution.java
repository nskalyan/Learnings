class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){
                arr.add(i);
            }
        }
        return arr;
    }
}
