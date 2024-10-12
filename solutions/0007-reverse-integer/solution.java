class Solution {
    public int reverse(int x) {
        String sc= Integer.toString(x);
            String res="";
            int n=sc.length();
        if(sc.charAt(0)=='-'){
            res=res+String.valueOf(sc.charAt(0));
            for(int i=n-1;i>=1;i--){
               res=res+String.valueOf(sc.charAt(i));
            }
        }
        else{
           for(int i=n-1;i>=0;i--){
               res=res+String.valueOf(sc.charAt(i));
            } 
        }

        try{
            int y= Integer.parseInt(res);
             if(y>=Math.pow(-2,31)&&y<=Math.pow(2,31)-1){
            return y;
         }
         else{
            return 0;
         }

        }
        catch(Exception e){
            return 0;
        }

    }
}
