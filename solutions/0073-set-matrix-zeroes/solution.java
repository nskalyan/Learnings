class Solution {
    public void setZeroes(int[][] matrix) {
     int m=matrix.length;
     int n=matrix[0].length;
     ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            ArrayList<Integer> a=new ArrayList<>();
            if(matrix[i][j]==0){
                a.add(i);
                a.add(j);
            arr.add(a);
            }
            System.out.println(arr);
        }
     }
     int iindex=0;
     int jindex=0;
     for(int i=0;i<arr.size();i++){
        for(int j=0;j<matrix[0].length;j++){
            iindex=arr.get(i).get(0);
            matrix[iindex][j]=0;
        }
        for(int k=0;k<matrix.length;k++){
             jindex=arr.get(i).get(1);
            matrix[k][jindex]=0;
        }
     }
        
    }
}
