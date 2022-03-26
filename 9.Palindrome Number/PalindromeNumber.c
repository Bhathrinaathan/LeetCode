// This file doesn't contain Main function. It carries only the required logical part :)
// Runtime: 11 ms, Memory Usage: 5.7 MB
bool isPalindrome(int x)
{
    long int rev=0,temp=x;
    while (temp>0)
    {
        rev=rev*10 + temp%10;
        temp/=10;
    }
    return rev==x;
}
