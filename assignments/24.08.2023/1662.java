class Solution {
    static String helper(String[] word1,String str1){
        for(int i =0 ; i<word1.length;i++){
            str1 +=word1[i];
        }
        return str1;
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        String x = helper(word1,str1);
        String y = helper(word2,str2);
        if(x.equals(y)) {
            return true;
        }
        else{
            return false;
        }
        
    }
}