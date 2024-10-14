class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> eww=new HashMap<Integer,Integer>();
        int[] result=new int[2];
          for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                 eww.put(grid[i][j],0);
            }
        } 
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                 eww.put(grid[i][j],eww.get(grid[i][j])+1);
                if(eww.get(grid[i][j])==2){
                    result[0]=grid[i][j];
                }
                 System.out.println(eww.get(grid[i][j]));
            }
        } 
       for(int i=1;i<=grid.length*grid.length;i++){
        if(!eww.containsKey(i)){
            result[1]=i;
        }
       }
        return result;
    }
}
