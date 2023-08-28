class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        findAll("(",1,0,n,res);
        return res;
    }
    void findAll(String curr,int open,int close,int n,List<String>res){
        // base condition
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }
        // main logic

        // open
        if(open<n)findAll(curr+"(",open+1,close,n,res);

        // close
        if(close<open)findAll(curr+")",open,close+1,n,res);

    }
}