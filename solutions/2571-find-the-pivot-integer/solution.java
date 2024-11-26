class Solution {
    public int pivotInteger(int n) {
        int j=0;
        if(n==1) return n;
        for(int i=1;i<n;i++){
            if(i*(i+1)==(n)*(n+1)-(i-1)*(i)){
                return i;
            }
            else
            j++;
        }
        return -1;
    }
}
