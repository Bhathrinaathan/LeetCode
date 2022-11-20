// Runtime: 23 ms
// Memory Usage: 6.9 MB

int firstUniqChar(char * s){
    int ascii[26]={0},indexOfUnique=-1;
    for (int i=strlen(s) - 1;i>=0;i--)
        ascii[s[i]-'a']++;
    for (int i=strlen(s)-1;i>=0;i--)
    {
        if (ascii[s[i]-'a']==1)
            indexOfUnique=i;
    }
    return indexOfUnique;
}
