class Solution {
    public String convert(String s, int numRows) {
        char[][] mat=new char[s.length()][numRows];
        int index=0,row=0,col=0;
        while(index<s.length())
        {
            for (int i=0;i<numRows;i++,col++)
            {
                if (index<s.length())
                    mat[row][col]=s.charAt(index++);
                else
                    break;
            }
            row++;
            for (col=numRows-2;col>=1;col--)
            {
                if (index<s.length())
                    mat[row++][col]=s.charAt(index++);
                else
                    break;
            }
            col=0;
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<numRows;i++)
        {
            for (int j=0;j<row;j++)
            {
                if (mat[j][i]!='\0')
                    sb.append(mat[j][i]);
            }
        }
        return sb.toString();
    }  
}

/*
p a y p
    a
  l
i s h i
    r
  i
n g
*/
