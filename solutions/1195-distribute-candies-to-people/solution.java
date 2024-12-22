class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        int index=0;
        int i=1;
        
        while(candies>0){
           arr[index]=arr[index]+Math.min(i,candies);
           candies=candies-i;
           i++;
           if(index<=num_people-2){
            index++;
           }
          else if(index==num_people-1){
              index=0;
           }
        }
        return arr;
    }
}
