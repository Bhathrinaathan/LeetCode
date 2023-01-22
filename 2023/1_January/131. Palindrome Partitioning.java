class Solution {
    public boolean isPalindrome(String s)
    {
        for (int i=0,j=s.length()-1;i<j;i++,j--)
            if (s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }
    public void backtrack(String s,int idx,List<List<String>> res,List<String> part)
    {
        if (idx==s.length())
        {
            res.add(new ArrayList(part));
            return;
        }
        for (int i=idx+1;i<=s.length();i++)
        {
            if (isPalindrome(s.substring(idx,i)))
            {
                part.add(s.substring(idx,i));
                backtrack(s,i,res,part);
                part.remove(part.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<List<String>>();
        List<String> part=new ArrayList<>();
        backtrack(s,0,res,part);
        return res;
    }
}
