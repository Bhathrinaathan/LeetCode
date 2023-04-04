class Solution {
    public int partitionString(String s) {
        String res;
        int last=0,count=1;
        for (int i=1;i<s.length();i++)
        {

            res=s.substring(last,i);
            if (res.contains(Character.toString(s.charAt(i))))
            {
                count++;
                last=i;
            }
        }

        return count;
    }
}
