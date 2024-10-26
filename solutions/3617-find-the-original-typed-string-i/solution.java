class Solution {
    public int possibleStringCount(String word) {
        // HashMap<Character,Integer> h=new HashMap<>();
        // HashSet<Character> h1=new HashSet<>();
        // int result=1;
        // for(int i=0;i<word.length();i++){
        //     h.put(word.charAt(i),0);
        // }
        
        // for(int i=0;i<word.length();i++){
        //     h.put(word.charAt(i),h.get(word.charAt(i))+1);
        //     h1.add(word.charAt(i));
        // }
        
        // for(int c:h.values()){
        //     result=result+c;
        // }
        int result=1;
        
        for(int i=0;i<word.length();i++){
            if(i+1<=word.length()-1){    
            if(word.charAt(i)!=word.charAt(i+1)){
                continue;
            }
            else{
                result++;
            }
            }
        }
        
        return result;
        
        
    }
}
