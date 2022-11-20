//Runtime: 2 ms
//Memory Usage: 5.7 MB
int uniqueMorseRepresentations(char ** words, int wordsSize){
     char morse[][6]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    int index=0,flag=0;
    char code[wordsSize][65];
    for (int i=0;i<wordsSize;i++)
    {
        flag=1;
        code[index][0]='\0';
        for (int j=0;words[i][j];j++)
            strcat(code[index],morse[words[i][j]-'a']);                                 
        strcat(code[index],"\0");
        for (int i=0;i<index;i++)
        {
            if (strcmp(code[i],code[index])==0)
            {   flag=0;break;}
        }
        if (flag==1)
            index++;
    }
    return index;
}
