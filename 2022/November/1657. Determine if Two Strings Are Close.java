class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] h1=new int[26];
        int[] h2=new int[26];
        HashSet<Character> set=new HashSet<>();
        if (word1.length()!=word2.length())
            return false;
        for (int i=0;i<word1.length();i++)
        {
            int c1=(int)(word1.charAt(i) - 'a');
            int c2=(int)(word2.charAt(i) - 'a');
            h1[c1]++;
            h2[c2]++;
            set.add(word1.charAt(i));
        }
        for (int i=0;i<word2.length();i++)
            set.remove(word2.charAt(i));
        Arrays.sort(h1);
        Arrays.sort(h2);
        System.out.print(set.size());
        if (Arrays.toString(h1).equals(Arrays.toString(h2)) && set.size()==0)
            return true;
        return false;
    }
}
