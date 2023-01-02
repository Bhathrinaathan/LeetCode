class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length()==1)
            return true;
        boolean parity=Character.isUpperCase(word.charAt(1));
        for (int i=1;i<word.length();i++)
        {
            if (Character.isUpperCase(word.charAt(i))!=parity)
            {
                return false;
            }
        }
        if (parity && Character.isLowerCase(word.charAt(0)))
            return false;
        return true;
    }
}
