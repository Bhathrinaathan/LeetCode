class Solution {
    public Boolean dfs(String s,HashSet<String> set)
    {
        for (int i=1;i<=s.length();i++)
        {
            String s1=s.substring(0,i);
            String s2=s.substring(i,s.length());
            if (set.contains(s1) && (set.contains(s2)||dfs(s.substring(i),set)))
                return true;
        }
        return false;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> set=new HashSet<>(Arrays.asList(words));
        List<String> res=new ArrayList<>();
        for (String s:words)
        {
            if (dfs(s,set))
            {
                res.add(s);
            }

        }
        return res;
    }
}
