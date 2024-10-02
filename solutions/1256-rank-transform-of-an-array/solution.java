class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return arr;
        }
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(arr[0],1);
        for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[i-1]){
            h.put(arr[i],h.get(arr[i-1])+1);
           }
        }
         for(int i=0;i<temp.length;i++){
            temp[i]=h.get(temp[i]);
         }
        return temp;
        }


    }

