class Solution {
    public boolean checkIfDivisible(String s1,String s2)
    {
        if (s1.length()%s2.length()!=0)
            return false;
        int multi=(s1.length()/s2.length());
        String res=s2.repeat(multi);
        return s1.equals(res);
    }
    public String gcdOfStrings(String str1, String str2) {
        String temp="";
        if (str1.length()<str2.length())
        {
            temp=str1;str1=str2;str2=temp;//Swap
        }
        String res="";
        for (int i=str2.length();i>=1;i--)
        {
            String curr=str2.substring(0,i);
            if (checkIfDivisible(str1,curr) && checkIfDivisible(str2,curr))
            {
                if (res.length()<curr.length())
                    res=curr;
            }
        }
        return res;
    }
}
