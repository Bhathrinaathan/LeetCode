class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<String>[] arr=new HashSet[26];
        for (int i=0;i<26;i++)
            arr[i]=new HashSet<String>();
        for (int i=0;i<ideas.length;i++)
        {
            arr[ideas[i].charAt(0)-'a'].add(ideas[i].substring(1));
        }
        long total=0l,common=0;
        for (int i=0;i<26;i++)
        {
            for (int j=0;j<26;j++)
            {
                if (i==j)
                    continue;
                common=0;
                for (String word:arr[i])
                {
                    if (arr[j].contains(word))
                        common++;
                }
                long res=(arr[i].size()-common)*(arr[j].size()-common);
                total+=res;
            }
            
        }
        return total;
    }
}
