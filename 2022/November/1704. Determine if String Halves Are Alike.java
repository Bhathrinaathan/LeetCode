class Solution {
    public int vowelCount(String s)
    {
        int count=0;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                count++;
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        return vowelCount(s.substring(0,s.length()/2))==vowelCount(s.substring((s.length()/2)));
    }
}
