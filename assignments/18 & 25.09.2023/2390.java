import java.lang.*;
import java.io.*;
import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i< s.length();i++){
            if(s.charAt(i)=='*'&& !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans = "";

        while(!st.isEmpty()){
            ans += st.pop();
        }
        String finalAns = "";
        for(int i = ans.length()-1; i>=0;i--){
            finalAns += ans.charAt(i);
        }
        return finalAns;
        
    }
}