class Solution {
    public String makeFancyString(String s) {
        StringBuilder FancyString=new StringBuilder();
        FancyString.append(s.charAt(0));
        int frequency=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
               frequency++;
            }
            else{
                frequency=0;
            }
            if(frequency==2){
                frequency--;
            }
            else{
                FancyString.append(s.charAt(i));
            }
        }

        return FancyString.toString();
    }
}
