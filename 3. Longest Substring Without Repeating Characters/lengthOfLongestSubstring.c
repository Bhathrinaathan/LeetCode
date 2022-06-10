//Runtime: 14 ms
//Memory Usage: 5.9 MB
int lengthOfLongestSubstring(char * S){
    int len=strlen(S),tempLen,maxLen=1;
    if (len==0)
            return 0;
    int occur[128];
    for (int i=0;i<128;i++)
        occur[i]=-1;
    for (int i=0;i<len;i++) 
    {
        tempLen=0;
        int j=i;
        while(j<len && occur[S[j]]<i)
        {   occur[S[j++]]=i;tempLen++; }
        if (tempLen>maxLen)
            maxLen=tempLen;
    }
    return maxLen;
}
