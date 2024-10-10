// import java.util.Scanner;

// class Solution {
//     public static int lengthOfLongestSubstring(String s) {
//         char[]ch = s.toCharArray();
//         ArrayList<Character> arr = new ArrayList<>();
//         int maxsum = 0;
//         int index = 0;
//         for(int i=index;i<s.length();i++){
//             if(!arr.contains(ch[i])){
//                 arr.add(ch[i]);
//             }
//             else{
//                 if(arr.size()>maxsum){
//                 maxsum = arr.size();
//                 }
//                 index++;
//                 arr.clear();
//             }
//         }
//         return maxsum;
//     }
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         lengthOfLongestSubstring(s);
//     }
// }

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        int maxsum = 0;
        int index = 0;
        
        // Iterate over the string
        for (int i = 0; i < s.length(); i++) {
            if (!arr.contains(ch[i])) {
                // Add the character if it's not already in the substring
                arr.add(ch[i]);
            } else {
                if (arr.size() > maxsum) {
                    maxsum = arr.size();
                }

                arr.clear();
                index++;  // Move to the next starting character
                i = index - 1;  // Reset 
            }
        }
        
        // Final check after the loop
        if (arr.size() > maxsum) {
            maxsum = arr.size();
        }
        
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  // Input string
        int result = lengthOfLongestSubstring(s);  // Get the result
        System.out.println(result);  // Print the result
    }
}

